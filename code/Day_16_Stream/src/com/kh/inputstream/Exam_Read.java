package com.kh.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("/Users/incheol/Temp/test1.rtf");
			int readByte; // 읽은 바이트를 저장할 변수
			while(true) {
				readByte = is.read();
				if(readByte == -1) break;
				System.out.println(readByte);
			}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
}
