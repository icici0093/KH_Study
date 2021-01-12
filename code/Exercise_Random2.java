package com.kh.rand;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random2 {

	public static void main(String[] args) {
		/*
		 * 가위/바위/보 
		 * 숫자를 선택하세요 (1.가위 / 2.바위 / 3.보) : 1
		 * 당신은 가위를 냈습니다. 
		 * 컴퓨터는 바위를 냈습니다.
		 * 컴퓨터가 승리하였습니다 / 비겼습니다 / 플레이어가 승리하였습니다
		 */
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("숫자를 선택하세요 (1. 가위 / 2. 바위 / 3. 보) : ");
		int player = sc.nextInt();
	
		// 1~3 사이의 숫자, 0 ~ 2 + 1 => 1 ~ 3
		int computer = rand.nextInt(3) + 1;
		
		// 결과 
		System.out.println("==== 결과 ====");
		switch(player) {
		case 1 : System.out.println("당신은 가위를 냈습니다.");
		break;
		case 2 : System.out.println("당신은 바위를 냈습니다.");
		break;
		case 3 : System.out.println("당신은 보를 냈습니다.");
		break;
		}
		switch(computer) {
		case 1 : System.out.println("컴퓨터는 가위를 냈습니다.");
		break;
		case 2 : System.out.println("컴퓨터는 바위를 냈습니다.");
		break;
		case 3 :System.out.println("컴퓨터는 보를 냈습니다.");
		break;
		}
		System.out.println("=============");
		if(player == 1 && computer == 3 || player == 2 && computer == 1 || player == 3 && computer == 2){
			System.out.println("플레이어가 승리하였습니다!");
		}else if(player == 1 && computer == 2 || player == 2 && computer == 3 || player == 3 && computer == 1) {
			System.out.println("컴퓨터가 승리하였습니다!");
		}else if(player == computer) {
			System.out.println("비겼습니다!");
		}
		System.out.println("");
		}
	
	}

}
