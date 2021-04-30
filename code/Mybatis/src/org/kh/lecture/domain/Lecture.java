package org.kh.lecture.domain;

public class Lecture {

	private int lectureNo;
	private String lectureName;
	private String lectureInstructor;
	private String lectureIntroduce;
	
	public Lecture() {}

	public Lecture(String lectureName, String lectureInstructor, String lectureIntroduce) {
		super();
		this.lectureName = lectureName;
		this.lectureInstructor = lectureInstructor;
		this.lectureIntroduce = lectureIntroduce;
	}
	
	public Lecture(int lectureNo, String lectureName, String lectureInstructor, String lectureIntroduce) {
		super();
		this.lectureNo = lectureNo;
		this.lectureName = lectureName;
		this.lectureInstructor = lectureInstructor;
		this.lectureIntroduce = lectureIntroduce;
	}

	public int getLectureNo() {
		return lectureNo;
	}

	public void setLectureNo(int lectureNo) {
		this.lectureNo = lectureNo;
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}

	public String getLectureInstructor() {
		return lectureInstructor;
	}

	public void setLectureInstructor(String lectureInstructor) {
		this.lectureInstructor = lectureInstructor;
	}

	public String getLectureIntroduce() {
		return lectureIntroduce;
	}

	public void setLectureIntroduce(String lectureIntroduce) {
		this.lectureIntroduce = lectureIntroduce;
	}

	@Override
	public String toString() {
		return "Lecture [lectureNo=" + lectureNo + ", lectureName=" + lectureName + ", lectureInstructor="
				+ lectureInstructor + ", lectureIntroduce=" + lectureIntroduce + "]";
	}
	
	
}
