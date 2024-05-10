package _02_Control;

public class LoopEx07 {
	public static void main(String[] args) {
		// 구구단 2단~9단까지 중 짝수단만 출력하기

		// 2단 형태 만들기

		for (int dan = 2; dan <= 9; dan++) {
			if (dan % 2 == 1)
				continue; // 홀수이면 출력하지 말자
			// if(dan % 2 == 0) //짝수이면 출력하자

			for (int by = 1; by <= 9; by++) {
				System.out.printf("%d X %d = %d\n", dan, by, dan * by);
			}
			System.out.println("-------------");
		}

//		for(int by=1; by<=9; by++) {
//			System.out.printf("2 X %d = %d \n", by, 2*by);
//			System.out.println();
//		}
//		for(int by=1; by<=9; by++) {
//			System.out.printf("3 X %d = %d \n", by, 3*by);
//			System.out.println();
//		}
//		for(int by=1; by<=9; by++) {
//			System.out.printf("4 X %d = %d \n", by, 4*by);
//			System.out.println();
//		}
//		for(int by=1; by<=9; by++) {
//			System.out.printf("9 X %d = %d \n", by, 9*by);
//			System.out.println();
//		}

	}
}
