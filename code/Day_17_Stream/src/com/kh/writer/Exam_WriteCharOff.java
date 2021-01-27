package com.kh.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteCharOff {
	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("/Users/incheol/Temp/test7.txt");
			char [] data = "자바는커피".toCharArray(); //띄어쓰기 인식 못함 
			writer.write(data, 3, 2);
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
