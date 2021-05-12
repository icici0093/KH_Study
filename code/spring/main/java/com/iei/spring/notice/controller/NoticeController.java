package com.iei.spring.notice.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.iei.spring.notice.domain.Notice;
import com.iei.spring.notice.domain.Search;
import com.iei.spring.notice.service.NoticeService;

@Controller
public class NoticeController {
	@Autowired
	private NoticeService nService;

	@RequestMapping(value="noticeList.kh", method=RequestMethod.GET)
	public String noticeList(Model model) {
		ArrayList<Notice> nList = nService.printAll();
		if(!nList.isEmpty()) {
			model.addAttribute("nList", nList);
			return "notice/noticeListView";
		}else {
			model.addAttribute("msg", "공지사항 목록조회 실패");
			return "common/errorPage";
		}
	}
	
	@RequestMapping(value="noticeDetail.kh", method=RequestMethod.GET)
	public String noticeDetail(@RequestParam("noticeNo") int noticeNo, 
								Model model) {
		Notice notice = nService.printOne(noticeNo);
		if(notice != null) {
			model.addAttribute("notice", notice);
			return "notice/noticeDetailView";
		}else {
			model.addAttribute("msg", "공지사항 상세조회 실패");
			return "common/errorPage";
		}
	}
	
	@RequestMapping(value="noticeSearch.kh", method=RequestMethod.GET)
	public String noticeSearch(@ModelAttribute Search search, Model model) {
		// 2개의 값을 하나에 담아서 보내는 방법
		// 1. Domain(VO) 클래스 이용
		// 2. HashMap 사용하기
		ArrayList<Notice> searchList = nService.printSearchAll(search);
		if(!searchList.isEmpty()) {
			model.addAttribute("nList", searchList);
			model.addAttribute("search", search);
			return "notice/noticeListView";
		}else {
			model.addAttribute("msg", "공지사항 검색 실패");
			return "common/errorPage";
		}
		
	}
	
	
	@RequestMapping(value="noticeWriteView.kh", method=RequestMethod.GET)
	public String noticeWriteView() {
		return "notice/noticeWriteForm";
	}
	
	@RequestMapping(value="noticeRegister.kh", method=RequestMethod.POST)
	public String registerNotice(@ModelAttribute Notice notice,
								@RequestParam(value="uploadFile", required=false) MultipartFile uploadFile,
								HttpServletRequest request,
								Model model) {
		// RequestParam의 required 속성은 해당 파라미터가 필수인지 체크하는 것
		
		// 스프링 설정 파일(root-context.xml)에 MultipartResolver로 등록
		// MultipartResolver는 Multiprt 형식으로 된 데이터가 전송된 경우
		// 해당 데이터를 스프링 MVC에서 사용할 수 있도록 변환해주는 기능을 함
		if(!uploadFile.getOriginalFilename().equals("")) {
			// eclipse 워크스페이스에 파일 저장하는 부분을 적는데
			// 너무 길어지니까 saveFile 메소드로 빼서 작성
			String filePath = saveFile(uploadFile, request);
			if(filePath != null) {
				notice.setNoticeFilepath(uploadFile.getOriginalFilename());
			}
		}
		int result = 0;
		result = nService.registerNotice(notice);
		if(result > 0) {
			return "redirect:home.kh";
		}else {
			model.addAttribute("msg", "공지사항 등록 실패");
			return "common/errorPage.jsp";
		}
	}
	
	public String saveFile(MultipartFile file, HttpServletRequest request) {
		// 파일 저장 경로 설정
		String root = request.getSession().getServletContext().getRealPath("resources");
		String savePath = root + "/nuploadFiles";
		// 저장 폴더 선택
		File folder = new File(savePath);
		// 폴더가 없을 경우 자동 생성
		if(!folder.exists()) {
			folder.mkdir();
		}
		String filePath = folder + "/" + file.getOriginalFilename();
		// 파일저장
		try {
			file.transferTo(new File(filePath));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 파일경로 리턴
		return filePath;
	}
	
	@RequestMapping(value="noticeModifyView.kh", method=RequestMethod.GET)
	public String noticeModifyView(@RequestParam("noticeNo") int noticeNo, Model model) {
		model.addAttribute("notice", nService.printOne(noticeNo));
		return "notice/noticeUpdateView";
	}
	
	@RequestMapping(value="noticeUpdate.kh", method=RequestMethod.POST)
	public String noticeUpdate(@ModelAttribute Notice notice, 
								Model model, 
								HttpServletRequest request,
								@RequestParam("reloadFile") MultipartFile reloadFile) {
		// 수정할 경우, 새로 업로드된 파일이 있을 경우
		if(reloadFile != null && !reloadFile.isEmpty()) {
			// 기존 업로드 된 파일 체크
			if(notice.getNoticeFilepath() != null) {
				// 기존 파일 삭제
				deleteFile(notice.getNoticeFilepath(), request);
			}
			// 새로 업로드된 파일 저장(워크스페이스,서버)
			String savePath = saveFile(reloadFile, request);
			// 파일 저장이 완료된 후 DB 저장도록 notice객체 값 셋팅
			if(savePath != null) {
				notice.setNoticeFilepath(reloadFile.getOriginalFilename());
			}
		}else {
			// 수정하지않는 경우
			
		}
		// DB에서 공지사항 수정(UPDATE)
		int result = nService.modifyNotice(notice);
		if(result > 0) {
			return "redirect:noticeDetail.kh?noticeNo="+notice.getNoticeNo();
		}else {
			model.addAttribute("msg", "공지사항 수정 실패");
			return "common/errorPage";
		}
	}
	
	// 공지사항 삭제, 첨부파일삭제
	@RequestMapping(value="noticeDelete.kh", method=RequestMethod.GET)
	public String noticeDelete(@RequestParam("noticeNo") int noticeNo, Model model,
								HttpServletRequest request) {
		Notice notice = nService.printOne(noticeNo);
		int result = nService.removeNotice(noticeNo);
		if(result > 0) {
			if(notice.getNoticeFilepath() != null) {
				deleteFile(notice.getNoticeFilepath(), request);
			}
			return "redirect:noticeList.kh";
		}else {
			model.addAttribute("msg", "공지사항 삭제 실패");
			return "common/errorPage";
		}
	}
	
	// 저장되어있는 파일 삭제
	public void deleteFile(String fileName, HttpServletRequest request) {
		String root = request.getSession().getServletContext().getRealPath("resources");
		String deletePath = root + "/nuploadFiles";
		// 파일을 삭제하기 위해서는 filePath가 필요하다
		// 파일이름만 알아도 filePath를 구할 수가 있다.
		File deleteFile = new File(deletePath + "/" + fileName);
		if(deleteFile.exists()) {
			deleteFile.delete();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
