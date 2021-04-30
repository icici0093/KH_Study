package org.kh.lecture.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.kh.lecture.domain.Lecture;
import org.kh.lecture.store.LectureStoreLogic;

import common.SqlSessionTemplate;

public class LectureServiceImpl implements LectureService{

	@Override
	public Lecture printLectureOne(int lectureNo) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		Lecture lecture = new LectureStoreLogic().printLectureOne(session, lectureNo);
		session.close();
		return lecture;
	}

	@Override
	public ArrayList<Lecture> printLectureAll() {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		ArrayList<Lecture> lectureList = new LectureStoreLogic().printLectureAll(session);
		// SELECT * FROM LECTURE
		session.close();
		return lectureList;
	}

	@Override
	public int registLecture(Lecture lecture) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new LectureStoreLogic().registLecture(session, lecture);
		if(result > 0) {
			session.commit();
		}else {
			session.rollback();
		}
		session.close();
		return result;
	}

	@Override
	public int modifyLecture(Lecture lecture) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new LectureStoreLogic().modifyLecture(session, lecture);
		if(result > 0) {
			session.commit();
		}else {
			session.rollback();
		}
		session.close();
		return result;
	}

	@Override
	public int removeLecture(int lectureNo) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new LectureStoreLogic().removeLecture(session, lectureNo);
		if(result > 0) {
			session.commit();
		}else {
			session.rollback();
		}
		session.close();
		return result;
	}

}
