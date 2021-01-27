package com.kh.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {
	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("/Users/incheol/Temp/test8.txt");
			// 배열로 안바꾸고 가능 
			String data = "자바 왤케 어려운거야";
			String data2 = "자바는 커피";
//			writer.write(data);
			writer.write(data, 0, 2);
			writer.write(data2, 4, 2);
			// 버퍼에 잔류하는 문자열 출력 
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
