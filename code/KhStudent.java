package org.kh.oop;

public class KhStudent extends Student2 {
	private int java;
	
	public int getJava() {
		return java;
	}
	
	public void setJava(int java) {
		this.java = java;
	}
	
	@Override
	public int total() {
		return super.total()+java;
	}
	
	@Override
	public double avg() {
		return (double) this.total()/4;
	}
}
