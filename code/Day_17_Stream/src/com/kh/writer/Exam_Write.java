package com.kh.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Write {
	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("/Users/incheol/Temp/test6.txt");
			char [] data = "자바다".toCharArray();
			for(int i = 0; i < data.length; i++) {
				// 인트값
				writer.write(data[i]);
			}
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
