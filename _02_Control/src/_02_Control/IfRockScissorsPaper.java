package _02_Control;

import java.util.Random;

public class IfRockScissorsPaper {
	public static void main(String[] args) {
		Random r = new Random();
		//가위바위보(Rock Scissors Paper)
		//가위:0 바위:1 보:2
		int scissors = 0, rock = 1, paper =2;
		System.out.println("가위바위보");
		//0~2의 세 수 중 하나 랜덤 추출
		//두 사람(김현준, 김종덕)이 가위바위보를 하여 누가 이겼는지 출력하기
		int jun = r.nextInt(3);
		int duck = r.nextInt(3);
		
			System.out.printf("김현준: %s\n",  jun ==0 ?"가위": (jun ==1 ? "바위": "보") );
		
			System.out.printf("김종덕: %s\n",   duck ==0 ?"가위": (duck ==1 ? "바위": "보") );
		
			
			//김
			//가위0>보2, 바위1>가위0, 보2>바위1
			if(jun == duck) {
				System.out.println("무승부");
			}else if(jun ==0 && duck== 2 
					|| jun ==1 && duck ==0 
					|| jun == 2 && duck ==1 ) {
				System.out.println("김현준 승!");
			}else {
				
				System.out.println("김종덕 승!");
			}
			
	}

}
