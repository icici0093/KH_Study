package org.kh.oop;

public class TestProgram2 {

	public static void main(String[] args) {
		KhStudent2 khStudent = new KhStudent2();
		
		khStudent.setKor(10);
		khStudent.setEng(10);
		khStudent.setMath(10);
		khStudent.setJava(10);
		
		System.out.println(khStudent.total());
		
		ITBankStudent itStudent = new ITBankStudent();
		itStudent.setKor(100);
		
	}

}
