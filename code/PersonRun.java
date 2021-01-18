package org.kh.oop;

import java.util.Scanner;

public class PersonRun {

	public static void main(String[] args) {
//		new Person().introduce();
		Person p = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		p.age = sc.nextInt();
		System.out.print("이름 입력 : ");
		p.name = sc.next();
		p.introduce();
	}
}
