package com.kh;

import java.util.Scanner;

public class Exercise_Character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��� �ּ��� : ");
		String name = sc.next();
		
		System.out.print("���̸� �Է��� �ּ��� : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("�ּҸ� �Է��� �ּ��� : ");
		String addr = sc.nextLine();
		
		System.out.print("Ű�� �Է��� �ּ��� : ");
		double tall = sc.nextDouble();
		
		System.out.print("�����Ը� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		System.out.print("������ �Է��� �ּ��� : ");
		char sex = sc.next().charAt(0);
		
		System.out.println("����� �̸��� : " + name);
		System.out.println("����� ���̴� : " + age);
		System.out.println("����� �ּҴ� : " + addr);
		System.out.println("����� Ű : " + tall);
		System.out.println("����� �����Դ� : " + weight);
		System.out.println("����� ������ : " + sex);
	
	}

}
