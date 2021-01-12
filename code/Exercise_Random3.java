package com.kh.rand;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random3 {

	public static void main(String[] args) {
		/*
		 * UP&DOWN 게임 
		 * 이 게임은 1 ~ 100 사이의 수 하나를 맞추는 게임입니다.
		 * 0을 입력하면 게임을 종료합니다.
		 * 숫자를 입력해주세요 : 55
		 * UP!!
		 * 숫자를 입력해주세요 : 77
		 * DOWN!!
		 * 숫자를 입력해주세요 : 64
		 * 유저가 정답을 2번만에 맞췄습니다!!
		 */
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int ran = rand.nextInt(100) + 1;
		int count = 1;
		while(true) {
			count++;
			System.out.print("숫자를 입력해주세요(user) : ");
			int num = sc.nextInt();
			
			if(num < ran) {
				System.out.println("UP!!");
			}else if(num > ran) {
				System.out.println("DOWN!!");
			}else {
				System.out.println("유저가 정답을 " + count + "번만에 맞췄습니다!!");
				System.out.println();
				System.out.println();
				break;
			}
		}
	}

}
