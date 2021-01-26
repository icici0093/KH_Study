package com.kh.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exam_Exception6 {
		/*
		 * 예외처리 방법 
		 * 1. try ~ catch문을 바로 사용해서 발생한 곳에서 직접 처리
		 * 2. throws를 사용하여 예외를 회피하는 방법 
		 * 		- throws는 여러번 사용 가능 
		 */
	public void testExcetion() throws FileNotFoundException {
		new FileReader("test.txt");
	}
}
