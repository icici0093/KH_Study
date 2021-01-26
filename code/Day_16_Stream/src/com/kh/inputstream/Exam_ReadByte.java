package com.kh.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("/Users/incheol/Temp/test1.rtf");
			int readByteNo;
			byte [] readBytes = new byte[3];
			String data = "";
			while(true) {
				readByteNo = is.read(readBytes);
				if(readByteNo == -1) break;
				// readByteNo는 읽은 갯수 
				// readBytes는 읽은 데이터 저장
				System.out.println(readByteNo);
//				data += new String(readBytes, 0, readByteNo);
			}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
