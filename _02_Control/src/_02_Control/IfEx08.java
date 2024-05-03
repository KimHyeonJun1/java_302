package _02_Control;

import java.util.Scanner;

public class IfEx08 {
	public static void main(String[] args) {
		
		
		int age = 1;
		
		Scanner scan = new Scanner( System.in);
		
		System.out.println("당신의 나이는?");
		age = scan.nextInt();
		if(age < 6 ) {
			System.out.println("유아");
		}else if(age < 12) {
			System.out.println("소아");
		}else if(age < 19) {
			System.out.println("청소년");
		}else {
			System.out.println("성인");
		}		
	
		
	}

}
