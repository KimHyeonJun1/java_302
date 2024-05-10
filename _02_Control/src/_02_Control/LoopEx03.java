package _02_Control;

public class LoopEx03 {
	public static void main(String[] args) {
		// 구구단 가로 출력하기

		for (int no = 1; no <= 9; no++) {
//			System.out.printf("2 X d% = %d", no, 2*no);
			for (int dan = 2; dan < 10; dan++) {
				System.out.printf("%d X %d = %d \t", dan, no, dan * no);
			}
			System.out.println();
		}

//		for(int dan =2; dan<10; dan++) {
//			System.out.printf("%d X 1 = %d \t", dan, dan*1);
//		}
//		System.out.println();
//		for(int dan =2; dan<10; dan++) {
//			System.out.printf("%d X 2 = %d \t", dan, dan*2);
//		}
//		System.out.println();
//		for(int dan =2; dan<10; dan++) {
//			System.out.printf("%d X 3 = %d \t", dan, dan*3);
//		}
//		System.out.println();
//	}

	}
}