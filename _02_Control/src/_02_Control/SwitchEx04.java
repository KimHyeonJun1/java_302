package _02_Control;

import java.util.Scanner;

public class SwitchEx04 {
	public static void main(String[] args) {
		//각 월별 분기 출력하기
		//제시문: 지금 몇 월인가요?
		//출력: 6월은 2분기 입니다
		System.out.println("지금 몇 월인가요?");
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		int one = 1;
		int two = 2;
		int three = 3;
		int four = 4;
		
		switch (month) {
		case 1: case 2: case 3:
			System.out.printf("%d월은 %d분기 입니다\n",month, one );
			break;
		case 4: case 5: case 6:
			System.out.printf("%d월은 %d분기 입니다\n",month, two );
			break;
		case 7: case 8: case 9:
			System.out.printf("%d월은 %d분기 입니다\n",month, three );
			break;
		case 10: case 11: case 12:
			System.out.printf("%d월은 %d분기 입니다\n",month, four );
			break;
			default :
				System.out.printf("%d월은 없습니다", month);
	
		
		}
		}
}

