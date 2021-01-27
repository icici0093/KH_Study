package com.kh.fileexam;

import java.io.File;
import java.io.IOException;

public class Exam_File2 {
	public static void main(String[] args) throws IOException {
		// 파일의 정보를 확인하는 메소드 
		File files = new File("parent");
		files.mkdirs();
		
		File makeFile = new File("parent/child.txt");
		makeFile.createNewFile();
		
		// 파일명, 경로, 파일용량, 상위폴더 
		System.out.println("파일명 : " + makeFile.getName()); // 파일명 저장 용도 
		System.out.println("파일 용량 : " + makeFile.length());
		System.out.println("상위 폴더 : " + makeFile.getParent());
		System.out.println("저장 절대경로 : " + makeFile.getAbsolutePath());
		System.out.println("저장 상대경로 : " + makeFile.getPath());
	}
}
