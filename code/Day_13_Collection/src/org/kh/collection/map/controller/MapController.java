package org.kh.collection.map.controller;

import java.util.HashMap;
import java.util.Map;

import org.kh.collection.set.model.vo.VOStudent;

public class MapController {
	public void hashMapEx1() {
		Map<String, VOStudent> map = new HashMap<String, VOStudent>();
		
		map.put("std001", new VOStudent("손예진", 100));
		map.put("std002", new VOStudent("유진", 99));
		map.put("std003", new VOStudent("심은경", 98));
		map.put("std004", new VOStudent("심은하", 97));
		
		System.out.println("저장된 데이터의 수 : " + map.size());
		
		System.out.println("==== key 값으로 value 가져오기 ====");
		System.out.println("key가 std002, value는 " + map.get("std002"));
		System.out.println("key가 std003, value는 " + map.get("std003"));
	}
}
