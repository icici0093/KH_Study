package com.kh.exception;

import java.io.FileNotFoundException;

public class Run {

	public static void main(String[] args) {
		Exam_Exception6_2 ex6_2 = new Exam_Exception6_2();
		try {
			ex6_2.testException2();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
