package com.iei.spring.notice.store;

import java.util.ArrayList;

import com.iei.spring.notice.domain.Notice;
import com.iei.spring.notice.domain.Search;

public interface NoticeStore {
	public ArrayList<Notice> selectList();
	public ArrayList<Notice> selectSearchList(Search search);
	public Notice selectOne(int nId);
	public int insertNotice(Notice notice);
	public int updateNotice(Notice notice);
	public int deleteNotice(int nId);
}
