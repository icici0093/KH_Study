package com.kh.filestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exam_FileInputStream {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"/Users/incheol/eclipse-workspace/workspace/Day_17_Stream/src/com/kh/filestream/Exam_FileInputStream.java");
			int dataByteNo;
			byte [] buf = new byte[100];
			String result = "";
			while((dataByteNo = fis.read(buf)) != -1) {
				result = new String(buf, 0, dataByteNo);
				System.out.println(result);
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
