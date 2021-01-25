package com.kh.javaapi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam_SimpleDateFormat {

	public static void main(String[] args) {
		Date today = new Date();
		
		// 2021-01-25
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		// 2021년 01월 25일 5주 월요일 
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy년 MM월 dd일 w주 E요일");
		// 21/01/25
		SimpleDateFormat format3 = new SimpleDateFormat("yy/MM/dd");
		// 16:17:30
		SimpleDateFormat format4 = new SimpleDateFormat("HH:mm:ss");
		// 04:19:02 오후
		SimpleDateFormat format5 = new SimpleDateFormat("hh:mm:ss a");
		System.out.println(format1.format(today));
		System.out.println(format2.format(today));
		System.out.println(format3.format(today));
		System.out.println(format4.format(today));
		System.out.println(format5.format(today));
	}

}
