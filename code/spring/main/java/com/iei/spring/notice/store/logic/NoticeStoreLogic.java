package com.iei.spring.notice.store.logic;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iei.spring.notice.domain.Notice;
import com.iei.spring.notice.domain.Search;
import com.iei.spring.notice.store.NoticeStore;

@Repository
public class NoticeStoreLogic implements NoticeStore{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public ArrayList<Notice> selectList() {
		return (ArrayList)sqlSession.selectList("noticeMapper.selectNoticeList");
	}

	@Override
	public ArrayList<Notice> selectSearchList(Search search) {
		return (ArrayList)sqlSession.selectList("noticeMapper.selectSearchList", search);
	}

	@Override
	public Notice selectOne(int nId) {
		Notice notice = sqlSession.selectOne("noticeMapper.selectOne", nId);
		return notice;
	}

	@Override
	public int insertNotice(Notice notice) {
		return sqlSession.insert("noticeMapper.insertNotice", notice);
	}

	@Override
	public int updateNotice(Notice notice) {
		return sqlSession.update("noticeMapper.updateNotice", notice);
	}

	@Override
	public int deleteNotice(int nId) {
		return sqlSession.delete("noticeMapper.deleteNotice", nId);
	}

}
