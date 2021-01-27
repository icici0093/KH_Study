package com.kh.filestream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Excercise_ByteStream {
	public static void main(String[] args)  throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 : ");
		String fileName = sc.next();
		sc.nextLine(); // 버퍼에 남은 엔터키 제거 
//		File file = new File(fileName);
//		file.createNewFile();
		FileOutputStream fos = new FileOutputStream(fileName);
		
		System.out.println(fileName + " 파일에 저장될 내용 입력  : ");
		System.out.println("종료는 exit.");
		int LineNum = 1;
		while(true) {
			System.out.print(LineNum++ + " : " );
			String str = sc.nextLine() + "\n";
			// 파일 출력 
			byte [] buf = str.getBytes();
			// 무한반복문에서 break가 없으면 뒤에 있는 코드는 실행되지 않음 
			// Unreachable code
			if(str.equals("exit\n")) break; // exit '\n' <- 엔터까지 비교
			fos.write(buf);
		}
		fos.flush();
		fos.close();
	}
}
