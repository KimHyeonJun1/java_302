package _02_Control;

import java.util.Scanner;

public class GugudanFor {
	public static void main(String[] args) {
		//구구단 7단 출력하기
		//7X1 = 7 ... 7X9= 63
		int dan = 7;
		for(int by=1; by <=9; by++) {
			System.out.printf("%d X %d= %d\n", dan, by, dan*by );
		}
		//1부터 입력한 수까지 출력하기
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("수를 입력하세요");
//		int no = s.nextInt();
//		for(int i=1; i<=no; i++) {
//			System.out.println( i );
//		}
		//1부터 입력한 수까지 중 3의 배수만 출력하기
		
		Scanner s = new Scanner(System.in);
		System.out.println("수를 입력하세요");
		int no = s.nextInt();
		for(int i=1; i<=no; i++){
			if( i % 3 == 0)
			System.out.print( i + "  ");
		}
	
//		for(int no=1; no<=10; no++) {
//			if( no % 2 == 0) {
//				System.out.println(no);
//		
		
		
		}

			
	}

