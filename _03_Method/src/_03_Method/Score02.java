package _03_Method;

import java.util.Scanner;

public class Score02 {
	public static void main(String[] args) {
		//학생명과 나이를 배열로 담자.
		//키보드로 이름 입력시 해당 나이를 출력하기
		// 제시문: 누구 나이를 알고 싶나요?
		//결과 : 홍길동의 나이: 28
		//선언언할 메소드: 나이를 반환하는 메소드
		
		System.out.println("누구 나이를 알고 싶나요?");
		Scanner scan = new Scanner(System.in);
		String name[] = {"홍길동", "김종덕", "김현준", "괴물", "좀비"};
		int age[] = {28, 25, 26, 9999, -9999};
		
		
		String s = scan.next();
		//이름
		int so = studentname(name, age, s);
		System.out.println(so);
		
		
//		for(int idx=0; idx<name.length; idx++) {
//			if(name[idx].equals(s)) {
//				System.out.println(age[idx]);
//			}
//		}
//		int idx = howOldAreYou(names, name); // 다른방법, 변수가 달라서 원래했던거랑은 다름
//		System.out.printf("%s의 나이: %d세 \n", name, idx==-1? 0 : ages[idx]);
	}
//	static int howOldAreYou(String names[], String name) {
//		int index = -1;
//		for(int idx=0; idx<names.length; idx++) {
//			if(names[idx].equals(name)) {
//				index = idx;
//				break;
//			}
//		}
//		return index;
//	}
	
	static int studentname(String name[], int age[], String s) {
		int as=0;
		for(int idx=0; idx<name.length; idx++) {
			
			if(name[idx].equals(s)) {
				as = age[idx];
				break;
				//System.out.println(age[idx]);
			}
			
		}
		return as;
	}
	
//	static void Whoname(String name[], int age[]) {
//		for(int no=0; no<name.length; no++) {
//			if(name[no].equals(28)) {
//				
//			}
//			
//		}
	}

