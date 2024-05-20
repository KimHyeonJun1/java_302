package _03_Method;

import java.util.Scanner;

public class Gender {
	public static void main(String[] args) {
//		실습
//		학생명과 성별을 각각 배열로 담자.
//		키보드로 이름 입력시 해당 성별을 출력하기
//		제시문: 누구의 성별을 알고 싶나요?
//		결과: 홍길동의 성별: 남
//
//		선언할 메소드: 
//		1. 성별을 반환하는 메소드
//		2. index 를 반환하는 메소드
//
//		"강철리", "김선우", "김종덕", "김현준", "박지빈", "신명섭", "이해진", "한신우"
		System.out.println("누구의 성별을 알고 싶나요?");
		Scanner scan = new Scanner(System.in);
		String name[] = {"강철리", "김선우", "김종덕", "김현준", "박지빈", "신명섭", "이해진", "한신우"};
		String gender[] = {"남", "남", "남", "남", "남", "남", "여", "여"};
		
		String s = scan.next();
		String genders = WhoGender(name, gender, s);
		System.out.printf("%s의 성별:" + genders, s );
//		"남", "남", "남", "남", "남", "남", "여", "여"
//
//
//		"010-1111-2222", "010-2222-3333", "010-3333-4444", "010-4444-5555",
//		"010-5555-6666", "010-6666-7777", "010-7777-8888", "010-8888-9999"
	}
	static String WhoGender(String name[], String gender[], String s) {
		String genders= "";
		for(int idx=0; idx<name.length; idx++) {
			if(name[idx].equals(s)) {
				genders = gender[idx];
				break;
			}
		}
		return genders;
	}
	
	static void WhoGender2(String name[], String gender[]) {
		int index = -1;
		for(int idx=0; idx<name.length; idx++) {
			
		}
	}
}
