package com.kh.rand;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random4 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int randNum = rd.nextInt(100) + 1;
		
		int count = 1;
		while(true) {
			System.out.print("숫자를 입력해주세요(user) : ");
			int userNum = sc.nextInt();
			int comNum = rd.nextInt(100) + 1;
			
			count++;
			if(userNum < randNum) {
				System.out.println("UP!!");
			}else if(userNum > randNum) {
				System.out.println("DOWN!!");
//			}else if(comNum < randNum) {
//				System.out.println("UP!!");
//			}else if(comNum > randNum) {
//				System.out.println("DOWN!!");
			}else if(userNum == randNum) {
				System.out.println("user가 정답을 " + count + "만에 맞췄습니다!!!!!!!!");
			}
			System.out.println("숫자를 입력해주세요(com) : " + comNum);
			if(comNum < randNum) {
				System.out.println("UP!!");
			}else if(comNum > randNum) {
				System.out.println("DOWN!!");
			}else if(comNum == randNum) {
				System.out.println("computer가 정답을 " + count + "만에 맞췄습니다!!!!!!!");
			}
		}
	}

}
