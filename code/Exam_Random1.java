package com.kh.rand;

import java.util.Random;

public class Exam_Random1 {
	public static void main(String[] args) {
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			System.out.println("0부터 0까지의 랜덤한 수 : " + rand.nextInt(10));
		}
		System.out.println();
		for(int i = 0; i < 10; i++) {
			System.out.println("1부터 10까지의 랜덤한 수 : " + (rand.nextInt(10) + 1));
		}
		System.out.println();
		for(int i = 0; i < 10; i++) {
			System.out.println("20부터 35까지의 랜덤한 수 : " + (rand.nextInt(16) + 20));
		}
	}
}
