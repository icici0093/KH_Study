package com.kh.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_read {
	public static void main(String[] args) {
		try {
			// Reader 스트림 객체 생성, test4 파일을 문자단위로 읽어옴 
			Reader reader = new FileReader("/Users/incheol/Temp/test4.rtf");
			// 읽은 데이터 저장 
			int readData;
			// read()로 반복문 돌면서 읽은 후 없으면 -1리턴 
			while((readData = reader.read()) != -1) {
				// 읽은 값을 char로 형변환 
				System.out.println((char)readData);
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
