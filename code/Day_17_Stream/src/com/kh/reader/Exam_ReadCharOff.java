package com.kh.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadCharOff {
	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("/Users/incheol/Temp/test4.rtf");
			int readCharNo;
			char [] cbuf = new char[4];
			// 1번 자리부터 2개를 저장  
			readCharNo = reader.read(cbuf, 1, 2); // ex)홍길동 -> [  ][홍][길][  ] 
			System.out.println("읽은 갯수 : " + readCharNo);
			for(int i = 0; i < cbuf.length; i++) {
				System.out.println(cbuf[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
