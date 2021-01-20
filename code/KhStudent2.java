package org.kh.oop;

public class KhStudent2 extends Student3 {
	private int java;
	
	public int getJava() {
		return java;
	}
	
	public void setJava(int java) {
		this.java = java;
	}
	
	@Override
	public int total() {
		return getKor()+getEng()+getMath()+java;
	}
	
	@Override
	public double avg() {
		return (double) this.total()/4;
	}
}
