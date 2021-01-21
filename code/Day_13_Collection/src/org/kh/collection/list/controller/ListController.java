package org.kh.collection.list.controller;

import java.util.ArrayList;
import java.util.List;

public class ListController {
	public void ListEx1() {
		List<String> list = new ArrayList<String>();
		// 다형성, Up-Casting 
		list.add("홍길동");
		list.add("임꺽정");
		list.add("각시탈");
		
		System.out.println("list의 크기 : " + list.size());
		for(int i = 0; i < list.size(); i++) {
		System.out.println(i + "번 인덱스의 값 : " + list.get(i));
		}
		System.out.println("==== 데이터 1개 삭제 ====");
		list.remove(1);
		System.out.println("==== 데이터 삭제 후 출력 ====");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + "번 인덱스의 값 : " + list.get(i));
		}
		System.out.println();
		System.out.println("==== 어중간 추가 ====");
		list.add(1, "어중간");
		System.out.println("==== 어중간 추가 후 출력 ====");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + "번 인덱스의 값 : " + list.get(i));
		}
		System.out.println("list에는 데이터가 없습니까? " + list.isEmpty());
		System.out.println("==== 모두 삭제 ====");
		list.clear();
		System.out.println("list에는 데이터가 없습니까? " + list.isEmpty());
	}
}
