package _02_Control;

import java.util.Random;

public class DiaceGame {
	public static void main(String[] args) {
		//두 개의 주사위를 던져서 합한 수 만큼 이동하기
		//두명이 함께 게임을 한다
		//50칸이 있는 말판을 끝가지 이동하면 게임이 끝난다.
		//만약 두 주사위가 같은 수가 나오면 추가로 한번 더 던질 수 있다.
			//두 주사위는 1~6까지 랜덤하게 추출
		Random r = new Random();
		int dice1, dice2, no=0;
		int june=0, duck=0;//각 게임자의 이동 최종위치를 담을 변수
		while(true) {
			
			//김현준 게임
			System.out.printf("[%d회차] 주사위를 던지세요~ \n", ++no);
			
			do {
			dice1 = r.nextInt(6) + 1;
			dice2 = r.nextInt(6) + 1;
			june += dice1 + dice2;
			System.out.printf("%s: (%d,%d) -> %d칸 이동 ==> 최종위치: %d\n", "김현준",
								dice1, dice2, dice1+dice2, june );
			if(dice1==dice2) {
				System.out.println("존잘 김현준 한번 더");
			}
			
			}while(dice1 == dice2);
			
			
			//김종덕
			do {
				dice1 = r.nextInt(6) + 1;
				dice2 = r.nextInt(6) + 1;
				duck += dice1 + dice2;
				System.out.printf("%s: (%d,%d) -> %d칸 이동 ==> 최종위치: %d, ", "존못 짱종덕",
						dice1, dice2, dice1+dice2, duck );
				if(dice1==dice2) {
						System.out.println("존못 짱종덕 한번 더");
				}
			}while(dice1 == dice2);
			
			
			if(june >= 50 && duck >= 50) {
				System.out.println("무승부");
				break;
			}else if(june >=50 || duck>=50){
				System.out.println("게임끝 승자: " +
												(june>=50 ? "김현준" : "김종덕")); 
				break;
			}//while끝
			
			
			//김현준/김종덕의 최종위치가 50이상이면 게임종료, 둘다 50이상이 되면 무승부
			
			
			
			}
		
			
			
	
			}
	}

	
	

