package com.kh.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Calendar {

	public static void main(String[] args) {
		// Calendar는 왜 추상 클래스일까?
		// 달력체계가 나라마다 다를 수 있기 때문에 추상클래스로 선언 
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int date = today.get(Calendar.DATE);
		int ampm = today.get(Calendar.AM_PM);
		int hour = today.get(Calendar.HOUR);
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("date : " + date);
		System.out.println("ampm : " + ampm);
		System.out.println("hour : " + hour);
		System.out.println("min : " + min);
		System.out.println("sec : " + sec);
		// 구버전 날짜 클래스 
		System.out.println(new Date());
		
		// 그레고리안 캘린더 객체 
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(new Date());
		calendar.add(Calendar.YEAR, 1);
		calendar.add(Calendar.MONTH, 2);
		System.out.println(calendar.getTime());
		
		// 데이터 형식 바꾸기 
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		// Date형을 String형으로 바꿔야 함 
		String strDate = format.format(new Date());
		System.out.println(strDate);
		
		String strDate2 = format.format(calendar.getTime());
		System.out.println(strDate2);
	}

}
