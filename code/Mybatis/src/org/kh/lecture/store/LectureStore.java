package org.kh.lecture.store;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.kh.lecture.domain.Lecture;

public interface LectureStore {
	public Lecture printLectureOne(SqlSession session, int lectureNo);
	public ArrayList<Lecture> printLectureAll(SqlSession session);
	public int registLecture(SqlSession session, Lecture lecture);
	public int modifyLecture(SqlSession session, Lecture lecture);
	public int removeLecture(SqlSession session, int lectureNo);
}
