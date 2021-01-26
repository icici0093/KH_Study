package com.kh.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByteOff {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("/Users/incheol/Temp/test1.rtf");
			int readByteNo; // 읽은 갯수
			byte [] readBytes = new byte[8];
			readByteNo = is.read(readBytes, 2, 3);
			System.out.println(readByteNo);
			for(int i = 0; i < readBytes.length; i++) {
				System.out.print(readBytes[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
