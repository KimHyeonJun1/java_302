package _02_Control;

import java.util.Scanner;

public class IfEx07_1 {
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner( System.in);
		
		System.out.println("당신의 나이는?");
		
		int age = 10;
		age = scan.nextInt();
//		if(age < 6 ) {
//			System.out.printf("%d세는 유아", age);
//		}else if(age < 12) {
//			System.out.printf("%d세는 소아", age);
//		}else if(age < 19) {
//			System.out.printf("%d세는 청소년", age);
//		}else {
//			System.out.printf("%d세는 성인", age);
//		}		
		
		String range ;
		if(age < 6 ) {
		    range = "유아";
	    }else if(age < 12) {
		    range = "소아";
		}else if(age < 19) {
			range = "청소년";
		//}else if(age>= 19) {
		}else {
			range = "성인";
		}
		System.out.printf("%d세는 %s", age, range);
	
}
}