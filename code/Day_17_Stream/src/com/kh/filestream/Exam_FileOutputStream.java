package com.kh.filestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exam_FileOutputStream {
	public static void main(String[] args) throws Exception {
		String originalFile = "/Users/incheol/Desktop/Exam_FileOutputStream.png";
		String copiedFile = "/Users/incheol/Temp/coied.png";
		
		FileInputStream fis = new FileInputStream(originalFile);
		FileOutputStream fos = new FileOutputStream(copiedFile);
		
		int readByteNo;
		byte [] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != -1) {
			//콘솔 출력 -> 파일 출력 
			fos.write(readBytes, 0, readByteNo);
		}
		fos.flush();
		
		fis.close();
		fos.close();
		System.out.println("작업이 완료되었습니다.");
	}
}
