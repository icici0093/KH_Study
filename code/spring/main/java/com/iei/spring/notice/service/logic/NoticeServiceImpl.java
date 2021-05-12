package com.iei.spring.notice.service.logic;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iei.spring.notice.domain.Notice;
import com.iei.spring.notice.domain.Search;
import com.iei.spring.notice.service.NoticeService;
import com.iei.spring.notice.store.NoticeStore;

@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	private NoticeStore nStore;

	@Override
	public ArrayList<Notice> printAll() {
		ArrayList<Notice> nList = nStore.selectList();
		return nList;
	}

	@Override
	public ArrayList<Notice> printSearchAll(Search search) {
		ArrayList<Notice> searchList = nStore.selectSearchList(search);
		return searchList;
	}

	@Override
	public Notice printOne(int nId) {
		Notice notice = nStore.selectOne(nId);
		return notice;
	}

	@Override
	public int registerNotice(Notice notice) {
		return nStore.insertNotice(notice);
	}

	@Override
	public int modifyNotice(Notice notice) {
		return nStore.updateNotice(notice);
	}

	@Override
	public int removeNotice(int nId) {
		return nStore.deleteNotice(nId);
	}

}
