package org.kh.oop;

public class ITBankStudent extends Student3{
	private int java;
	private int oracle;
	private int html;
	
	public void setJava(int java) {
		this.java = java;
	}
	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	@Override
	public int total() {
		return getKor()+getEng()+getMath()+java+oracle;
	}
	
	@Override
	public double avg() {
		return (double) this.total()/5;
	}
}

