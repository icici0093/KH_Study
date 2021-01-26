package com.kh.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write2 {

	public static void main(String[] args) {
		// write()
		// flush()
		try {
			OutputStream os = new FileOutputStream("/Users/incheol/Temp/test2.rtf");
			byte [] data = "Hello I/O2".getBytes();
			os.write(data);
			os.flush(); // 저장 완료
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
