package org.kh.lecture.service;

import java.util.ArrayList;

import org.kh.lecture.domain.Lecture;

public interface LectureService {
	public Lecture printLectureOne(int lectureNo);
	public ArrayList<Lecture> printLectureAll();
	public int registLecture(Lecture lecture);
	public int modifyLecture(Lecture lecture);
	public int removeLecture(int lectureNo);
}
