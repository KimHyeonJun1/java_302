package _03_Method;

import java.util.Random;

public class MethodEx10 {
	
	static int throwDice(int player, String name) {
		Random r = new Random();
		int dice1, dice2;
		//김현준
		
		do {
			dice1 = r.nextInt(6) + 1;
			dice2 = r.nextInt(6) + 1;
			player += dice1 + dice2;
			System.out.printf("%s: (%d,%d) -> %d칸 이동 ==> 최종위치: %d\n", name,
								dice1, dice2, dice1+dice2, player );
			if(dice1==dice2) {
				System.out.println(name + " 한번 더");
			}
			
			}while(dice1 == dice2);
			return player;
		
	}
	
	
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
				
				System.out.printf("[%d회차] 주사위를 던지세요~ \n", ++no);
				
				//김현준 게임
				june = throwDice(june, "기면준");
				
				
				//김종덕
				duck = throwDice(duck, "짱종덕");
				
				
				
				//김현준/김종덕의 최종위치가 50이상이면 게임종료, 둘다 50이상이 되면 무승부
				if(june >= 50 && duck >= 50) {
					System.out.println("무승부");
					break;
				}else if(june >=50 || duck>=50){
					System.out.println("게임끝 승자: " +
													(june>=50 ? "기면준" : "짱종덕" )); 
					break;
				}//while끝
				
				
				
				
				
				}
			
				
				
		
				}
		}

		
		



