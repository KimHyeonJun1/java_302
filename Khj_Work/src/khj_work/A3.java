package khj_work;

import java.util.Scanner;

public class A3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int jumsu;
		System.out.println("당신의 학점을 입력하세요");
		jumsu = scan.nextInt();
		
		if(jumsu > 100) {
			System.out.println("100점 초과의 점수를 입력할수 없습니다.");
		}else if( jumsu >= 90) {				
			System.out.println("A학점");
		}else if( jumsu >= 80) {
			System.out.println("B학점"); 
		}else if( jumsu >= 70) {
			System.out.println("C학점"); 
		}else if( jumsu >= 60) {
			System.out.println("D학점"); 
			
		}else if( jumsu >= 0){  	
			System.out.println("F학점");
		}else {
			System.out.println("0이상의 점수를 입력하세요.");
		}
		
		
	}
}
