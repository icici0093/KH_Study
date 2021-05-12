package com.iei.spring.notice.service;

import java.util.ArrayList;

import com.iei.spring.notice.domain.Notice;
import com.iei.spring.notice.domain.Search;

public interface NoticeService {
	public ArrayList<Notice> printAll();
	public ArrayList<Notice> printSearchAll(Search search);
	public Notice printOne(int nId);
	public int registerNotice(Notice notice);
	public int modifyNotice(Notice notice);
	public int removeNotice(int nId);
}
