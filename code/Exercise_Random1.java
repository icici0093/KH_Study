package com.kh.rand;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {

	public static void main(String[] args) {
		/*
		 * 동전 앞뒤 맞추기 게임 
		 * 숫자를 입력(1.앞면 / 2.뒷면) : 1 
		 * 맞췄습니다. 
		 * 
		 * 숫자를 입력(1.앞면 / 2.뒷면) : 2
		 * 땡! 틀렸습니다. 
		 * 저장되어있는 숫자는 랜덤으로 생성한 난수 
		 * 사용자가 입력한 값과 비교 후 결과를 출력 
		 * 1 또는 2 이외에 값이 입력된 경우 "다시 입력하세요" 출력 (continue 이용)
		 */
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
			while(true) {
				int computer = (rand.nextInt(2)+1);
				System.out.print("숫자를 입력(1. 앞면 / 2. 뒷면) : ");
				int player = sc.nextInt();
				if (!(player > 0 && player < 3)) {
					System.out.println("다시 입력하세요.");
					continue;
				}
					if(computer == player) {
						System.out.println("맞췄습니다!");
					}else {
						System.out.println("땡! 틀렸습니다!");
					}
			}
	}
}
