package org.kh.collection.set.model.vo;

public class VOStudent {
	private String name;
	private int score;
	
	public VOStudent() {}
	
	public VOStudent(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "학생의 이름 : " + this.name + ", 학생의 점수 : " + this.score;
	}
}
