package com.kh.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteChar {
	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("/Users/incheol/Temp/test5.txt");
			char [] data = "자바다".toCharArray();
			// 배열
			writer.write(data);
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
