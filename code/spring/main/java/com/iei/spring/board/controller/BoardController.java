package com.iei.spring.board.controller;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
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
import org.springframework.web.servlet.ModelAndView;

import com.iei.spring.board.domain.Board;
import com.iei.spring.board.domain.PageInfo;
import com.iei.spring.board.service.BoardService;
import com.iei.spring.common.Pagination;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService bService;

	@RequestMapping(value="boardList.kh", method=RequestMethod.GET)
	public ModelAndView boardListView(ModelAndView mv
									,@RequestParam(value="page", required=false) Integer page) {
//		model.addAttribute("boardList", "boardList");
//		return "board/boardListView";
		int currentPage = (page != null) ? page : 1;
		int listCount = bService.getListCount();
		PageInfo pi = Pagination.getPageInfo(currentPage, listCount);
		ArrayList<Board> bList = bService.printAll(pi);
		if(!bList.isEmpty()) {
			mv.addObject("bList", bList);
			mv.addObject("pi", pi);
			mv.setViewName("board/boardListView");
		}else {
			mv.addObject("msg", "게시글 전체조회 실패");
			mv.setViewName("common/errorPage");
		}
		return mv;
	}
	
	// 상세페이지 
	@RequestMapping(value="boardDetail.kh", method=RequestMethod.GET)
	public String boardDetail(@RequestParam("boardNo") int boardNo, Model model) {
		Board board = bService.printOne(boardNo);
		if(board != null) {
			model.addAttribute("board", board);
			return "board/boardDetailView";
		}else {
			model.addAttribute("msg", "게시글 조회 실패");
			return "common/errorPage";
		}
	}
	
	// 게시판 등록화면 
	@RequestMapping(value="boardWriteView.kh", method=RequestMethod.GET)
	public String boardWriteView() {
		return "board/boardWriteForm";
	}
	
	// 게시글 등록 
	@RequestMapping(value="boardRegister.kh", method=RequestMethod.POST)
	public ModelAndView boardRegister(ModelAndView mv,
																@ModelAttribute Board board,
																@RequestParam(value="uploadFile", required=false) MultipartFile uploadFile,
																HttpServletRequest request) {
		if(!uploadFile.getOriginalFilename().equals("")) {
			String renameFileName = saveFile(uploadFile, request);
			if(renameFileName != null) {
				board.setOriginalFilename(uploadFile.getOriginalFilename());
				board.setRenameFilename(renameFileName);
			}
		}
		
		// 디비에 데이터를 저장하는 작업
		int result = 0;
		String path = "";
		result = bService.registerBoard(board);
		if(result > 0) {
			path = "redirect:boardList.kh";
		}else {
			mv.addObject("msg", "게시글 등록 실패!");
			path = "common/errorPage";
		}
		mv.setViewName(path);
		return mv;
	}
	
	public String saveFile(MultipartFile file, HttpServletRequest request) {
		// 파일 저장 경로 설정
		String root = request.getSession().getServletContext().getRealPath("resources");
		String savePath = root + "/buploadFiles";
		// 저장 폴더 선택 
		File folder = new File(savePath);
		// 폴더없으면 자동 생성 
		if(!folder.exists()) {
			folder.mkdir();
		}
		// 파일명 변경하기 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String originalFileName = file.getOriginalFilename();
		String renameFileName = sdf.format(new Date(System.currentTimeMillis())) + "." 
													+ originalFileName.substring(originalFileName.lastIndexOf(".")+1);
														// 확장자명 가져오기 
		String filePath = folder + "/" + renameFileName;
		// 파일 저장 
		try {
			file.transferTo(new File(filePath));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 리턴 
		return renameFileName;
	}
}









