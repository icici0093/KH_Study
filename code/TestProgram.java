package org.kh.oop;

public class TestProgram {

	public static void main(String[] args) {
		KhStudent khStudent = new KhStudent();
		
		khStudent.setKor(10);
		khStudent.setEng(10);
		khStudent.setMath(10);
		khStudent.setJava(10);
		
		System.out.println(khStudent.total());
	}

}
