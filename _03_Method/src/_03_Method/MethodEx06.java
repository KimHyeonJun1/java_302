package _03_Method;

public class MethodEx06 {
	
	
	static void num(int no1, int no2) {
		for(int no = no1+1; no < no2; no++) {
			System.out.print(no + " ");
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		// 1. 두 수 사이의 정수를 출력하기
		// 2. 메소드를 호출하기
		num(1, 5);
		// 1과 5사이의 정수 출력하기
//		for (int no = 2; no < 5; no++) {
//
//			System.out.print(no + " ");
//		}
//		System.out.println();
//
//		for (int no = 6; no < 10; no++) {
//
//			System.out.print(no + " ");
//		}
//		System.out.println();
//
//		for (int no = 16; no < 20; no++) {
//
//			System.out.print(no + " ");
//		}
//
//		// 5과 10사이의 정수 출력하기
		num(5, 10);
//		// 15과 20사이의 정수 출력하기
		num(15, 20);

	}

}
