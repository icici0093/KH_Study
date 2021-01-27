package com.kh.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {

	public static void main(String[] args) {
		try {
			// 
			Reader reader = new FileReader("/Users/incheol/Temp/test4.rtf");
			// 읽은 문자 갯수 
			int readCharNo;
			// 읽은 데이터 저장 
			char [] cbuf = new char[2];
			// 문자열로 변환하기 위해 선언 
			String data = "";
			while(true) {
				readCharNo = reader.read(cbuf);
				if(readCharNo ==  -1) break;
				System.out.println("읽은 문자 수 : " + readCharNo);
				//읽어온 문자를 문자열로 모두 바꿈, += 누적되는 것 
				data += new String(cbuf, 0, readCharNo);
			}
			// test 파일에서 읽어온 문자 출력 
			System.out.println(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
