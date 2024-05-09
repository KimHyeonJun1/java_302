package _02_Control;

import java.util.Random;

public class DoWhileEx04 {
	public static void main(String[] args) {
		//가위바위보 : 무승부 없음, 승자가 결정될때까지 가위바위보를 계속한다
		//가위0>보2     바위1>가위0      보2>바위1
//		Random r = new Random();
//		int scissors = 0, rock = 1, paper = 2;
//		int hong, park;
//		do {
//			System.out.println("가위바위보~♥");
//			hong = r.nextInt(3);
//			park = r.nextInt(3);
//			System.out.printf("홍길동: %s, 박문수: %s\n", 
//					hong ==0 ? "가위" : (hong==1? "바위" : "보"),
//					park ==0 ? "가위" : (park==1? "바위" : "보")
//							);
//		}while(hong == park);
//		if(hong == 0 && park == 2 || hong ==1 && park ==0 || hong==2 && park==1) {
//			System.out.println("홍길동 승");
//		}else 
//			System.out.println("박문수 승");
			
		Random r = new Random();
		int yut = 0;
		do {
			int bar1 = r.nextInt(2); // 0~1 두 수 중 랜덤 추출
			int bar2 = r.nextInt(2); // 0~1 두 수 중 랜덤 추출
			int bar3 = r.nextInt(2); // 0~1 두 수 중 랜덤 추출
			int bar4 = r.nextInt(2); // 0~1 두 수 중 랜덤 추출
			yut = 0;
			System.out.print(bar1 ==0 ?"앞" : "뒤");
			System.out.print(bar2 ==0 ?"앞" : "뒤");
			System.out.print(bar3 ==0 ?"앞" : "뒤");
			System.out.print(bar4 ==0 ?"앞" : "뒤");
			System.out.print(" --> ");
			yut = bar1 + bar2 + bar3+ bar4 ;
			switch(yut) {
			case 0:
				System.out.println("윷");
				break;
			case 1:
				System.out.println("걸");
				break;
			case 2:
				System.out.println("개");
				break;
			case 3:
				System.out.println("도");
				break;
			case 4:
				System.out.println("모");
				break;
			}
			
			if(yut == 0){
				System.out.println("한번 더");
			}else if(yut == 1) {
				System.out.println("스탑");
			}else if(yut == 2) {
				System.out.println("스탑");				
			}else if(yut ==3) {
				System.out.println("스탑");	
			}else if(yut ==4) {
				System.out.println("한번 더");
			}
			
		}while(yut == 0 || yut ==4);{
			
		}
		
			
		
		
		
		
		
		
		
	}
}
