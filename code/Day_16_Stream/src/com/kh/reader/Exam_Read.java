package com.kh.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("/Users/incheol/Temp/test4.rtf");
			int readData;
			while(true) {
				readData = reader.read();
				if(readData == -1) break;
				System.out.print((char)readData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
