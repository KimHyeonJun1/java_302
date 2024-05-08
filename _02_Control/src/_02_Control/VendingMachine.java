package _02_Control;

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//자판기메뉴
		int coke = 1250, letsbe = 800, coco = 1000;
		System.out.println("--- 자판기메뉴 ---");
		System.out.printf("1.콜라: %d원 \n", coke);
		System.out.printf("2.레쓰비: %d원 \n", letsbe);
		System.out.printf("3.코코팜: %d원 \n", coco);
		//각 메뉴의 금액을 담을 변수 선언
		
		
		
		//돈을 투입구에 넣기
		System.out.println("투입구에 돈을 넣으세요");
		//키보드로 입력해서 돈을 투입하기: 투입한 돈을 담을 변수 선언
		
		
		int money = scan.nextInt();
		System.out.println("투입금액" + money);
		
		//투입금액에 따라 선택할 수 있는 음료에 선택가능 램프가 켜지도록 한다
		boolean bCoke = false, bLetsbe=false, bCoco=false;
//		
//		if(money >= coke) {
//		
//					
//		}else if(money >= letsbe) {
//			bLetsbe = true;
//			bCoke = true;
//			
//		}if(money >= coco) {
//			bCoke = true;
//			
//		}
//		
		if(money >= letsbe)    bLetsbe = true;
		if(money >= coco)      bCoco = true;
		if(money >= coke)      bCoke = true;
		System.out.printf("1. 콜라 : %d원 [%s]\n", coke, bCoke ? "on" : "off");
		System.out.printf("2. 레쓰비 : %d원 [%s]\n", letsbe, bLetsbe ? "on" : "off");
		System.out.printf("3. 코코팜 : %d원 [%s]\n", coco, bCoco ? "on" : "off");
		
		System.out.println("음료를 선택하세요");
		int choice = scan.nextInt();
		int change = money;
		if( bCoke && choice ==1) {
			System.out.println("콜라 나온다");
			change = money - coke;
		}else if( bLetsbe && choice ==2) {
			System.out.println("레쓰비 나온다");
			change = money - letsbe;
		}else if(bCoco && choice ==3) {
			System.out.println("코코팜 나온다");
			change = money - coco;
		}
		
		System.out.printf("거스름돈: %d \n" , change);
		
		if( change > 0 ) { //거스름돈이 있는 경우만 처리
			int c1000=0, c500=0, c100=0, c50=0;
			c1000 = change / 1000; //1500 - 1000 -> 500 1000 0개
			if( c1000 > 0) System.out.printf("1000원 %d장 \n", c1000);
			
			
		change %= 1000;	//change = change % 1000;
		c500 = change / 500;
		if( c1000 > 0) System.out.printf("500원 %d장 \n", c500);
		
		change %= 500;
		c100 = change / 100;
		if(c100 > 0)System.out.printf("100원 %d개\n", c100);
		
		change %= 100;
		c50 = change / 50;
		if(c50 > 0)System.out.printf("50원 %d개\n", c50);
		
		}
		
		
	}
}
	//	System.out.printf("거스름 돈은 %d입니다.", money);
		
		
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
		
		
	

