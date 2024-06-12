package map;

import java.util.HashMap;

public class HashMapMain1 {
	public static void main(String[] args) {
		//학생별 성적을 관리하고자 한다
		 HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//저장
		 map.put("홍길동", 90);
		 map.put("심청", 88);
		 map.put("박문수", 93);
		 
		 //조회
		 int score = map.get("심청");
		System.out.println("심청의 성적: " + score);
		
		//삭제
		map.remove("박문수");
		System.out.println("박문수의 성적: " + map.get("박문수"));
		
		Integer park = map.get("박문수"); // Integer -> int : unBoxing --> null ->?
		System.out.println("박문수의 성적: " + park);
	}
}
