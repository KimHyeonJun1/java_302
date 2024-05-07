package _02_Control;

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		//자판기메뉴
		System.out.println("--- 자판기메뉴 ---");
		System.out.println("1.콜라: 1250원");
		System.out.println("2.사이다: 1000원");
		System.out.println("3.레쓰비: 800원");
		//각 메뉴의 금액을 담을 변수 선언
		Scanner scan;
		scan = new Scanner(System.in);
		
		
		
		//돈을 투입구에 넣기
		System.out.println("투입구에 돈을 넣으세요");
		//키보드로 입력해서 돈을 투입하기: 투입한 돈을 담을 변수 선언
		int money = scan.nextInt();
		System.out.println("음료를 선택하세요");
		int choice = scan.nextInt();
		int don;
		if(choice == 1) {
			System.out.println("콜라");
		don=money - 1250;
		
		
			
			
		}else if(choice == 2) {
			don=money - 1000;
			System.out.println("사이다");
		}else if(choice == 3) {
			don=money - 800;
			System.out.println("레쓰비");
		}else {
			don=money;
		}
		System.out.printf("거스름 돈은 %d입니다.", don);
		
		
//		if(coke >=1250) {
//			System.out.println("콜라 선택가능");
//		}else if(coke < 1250) {
//			System.out.println("돈이 부족합니다");
//		}
		
//		int cidar = scan.nextInt();
//		cidar = 1000;
//		if(choice == 2) {
//		if(cidar >= 1000) {
//			System.out.println("사이다 선택가능");			
//		}else if(cidar < 1000) {
//			System.out.println("돈이 부족합니다");}}
//	
//		int coffee = scan.nextInt();
//		coffee = 800;
//		if(choice == 3) {
//	    if(coffee >= 800) {
//			System.out.println("레쓰비 선택가능");}
//		else if(coffee < 800) {
//			System.out.println("돈이 부족합니다");
//		}}
//		
//		//투입금액에 따라 선택할 수 있는 음료에 선택가능 램프가 켜지도록 한다
//		
		
		//메뉴선택
		//선택한 메뉴에 따른 거스름돈 계산하기
		
		
		//제품이 나오고, 거스름돈이 나온다
		//1000원짜리 몇개
		//500원짜리 몇개
		//100원짜리 몇개
		//50원짜리 몇개
		
		
	}
}
