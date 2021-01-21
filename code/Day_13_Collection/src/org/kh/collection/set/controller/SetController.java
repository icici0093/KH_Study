package org.kh.collection.set.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.kh.collection.set.model.vo.VOStudent;

public class SetController {
	// Set의 특징 
	// 저장된 값의 순서를 유지하지않고 중복을 허용하지 않음  
	// 순서가 없으므로 index로 접근 불가능하며 
	// Iterator를 이용하여 요소에 접근 가능함 
	
	public void hashSetEx1() {
		Set<String> set = new HashSet<String>();
		
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("one");
		set.add("two"); // 중복 허용X
		
		System.out.println("저장된 데이터의 수 : " + set.size());
		
		System.out.println("==== 데이터 모두 삭제 ====");
		set.clear();
		
		System.out.println("데이터가 모두 삭제되었는가? :" + set.isEmpty());
	}
	
	public void hashSetEx2() {
		Set<VOStudent> set = new HashSet<VOStudent>();
		
		set.add(new VOStudent("강동원", 100));
		set.add(new VOStudent("소지섭", 99));
		set.add(new VOStudent("조인성", 98));
		set.add(new VOStudent("정우성", 97));
		
		// Iterator 이용
		// 컬렉션에 저장된 요소들을 접근하는데 사용되는 인터페이스 
		// 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화한 것으로
		// Iterator를 구현한 클래스의 인스턴스를 반환하는 iterator() 메소드로 반환해준다 
		System.out.println(set);
		Iterator<VOStudent> it = set.iterator();
		while(it.hasNext()) {
			// 있으면 실행 
			System.out.println(it.next());
		}
	}
}
