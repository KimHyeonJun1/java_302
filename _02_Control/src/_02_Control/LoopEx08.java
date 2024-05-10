package _02_Control;

public class LoopEx08 {
	public static void main(String[] args) {
		// 구구단 2단~9단까지 출력하기
		// 조건 X3, X6, X9는 출력하지 않기
		for (int no = 2; no <= 9; no++) {
			for (int dan = 1; dan <= 9; dan++) {
				if (dan % 3 == 0)
					continue;
				System.out.printf("%d X %d = %d\n", no, dan, no * dan);
			}
			System.out.println("-------------");
		}

	
	}
}
