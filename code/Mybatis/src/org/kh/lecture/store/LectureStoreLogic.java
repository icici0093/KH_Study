package org.kh.lecture.store;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kh.lecture.domain.Lecture;

public class LectureStoreLogic implements LectureStore{

	@Override
	public Lecture printLectureOne(SqlSession session, int lectureNo) {
		Lecture lecture = session.selectOne("LectureMapper.selectOneLecture", lectureNo);
		return lecture;
	}

	@Override
	public ArrayList<Lecture> printLectureAll(SqlSession session) {
		List<Lecture> lectureList = session.selectList("LectureMapper.selectAllLecture");
		return (ArrayList<Lecture>)lectureList;
	}

	@Override
	public int registLecture(SqlSession session, Lecture lecture) {
		int result = session.insert("LectureMapper.insertLecture", lecture);
		return result;
	}

	@Override
	public int modifyLecture(SqlSession session, Lecture lecture) {
		int result = session.update("LectureMapper.updateLecture", lecture);
		return result;
	}

	@Override
	public int removeLecture(SqlSession session, int lectureNo) {
		int result = session.delete("LectureMapper.deleteLecture", lectureNo);
		return result;
	}

}
