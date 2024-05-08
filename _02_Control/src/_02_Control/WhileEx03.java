package _02_Control;

import java.util.Scanner;

public class WhileEx03 {
	public static void main(String[] args) {
		// while문
		//제시문: 구구단 몇 단?
		// ex 7
		// 7단
		// 7 x 1 = 7 .... 7 x 9 = 63
		
		System.out.println("구구단 몇 단?");
		Scanner s = new Scanner(System.in);
		int by = s.nextInt();
//		while (by <= 1) {
//			System.out.printf("%d X %d = %d\n", ,  );
//			++by;
//			int table = ;
//			{
//			}
		int plus = 1;
		while (plus <= 9) {
			System.out.printf("%d X %d = %d\n", by, plus, by*plus  );
			++plus;	
		 
		}
		
		}
	}


