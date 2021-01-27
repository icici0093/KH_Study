package com.kh.fileexam;

import java.io.File;
import java.io.IOException;

public class Exam_File {
	public static void main(String[] args) throws IOException {
		// workspace Project폴더에 test.txt 파일 생성 
		File file = new File("test.txt");
		file.createNewFile();
		
		// 기본 드라이브나 폴더에 파일 생성하기  
		File fileMaker = new File("/Users/incheol/Temp/testFile.txt");
		fileMaker.createNewFile();
		// 폴더 만들고 파일 생성하기 
		File folderMaker = new File("/Users/incheol/Temp/test");
		folderMaker.mkdir();
		// 계층적인 폴더 만들기 
		File folderMaker2 = new File("/Users/incheol/Temp/test/test2/test3");
		folderMaker2.mkdirs();
		File fileMaker2 = new File("/Users/incheol/Temp/test/test2/test3/test.txt");
		fileMaker2.createNewFile();
		
		// 파일 존재여부 확인 
		System.out.println(file.exists());
		// 파일 여부 확인
		System.out.println(file.isFile());
		System.out.println(folderMaker.isFile());
	}
}
