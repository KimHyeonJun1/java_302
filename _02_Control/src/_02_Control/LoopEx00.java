package _02_Control;

import java.util.Scanner;

public class LoopEx00 {
	public static void main(String[] args) {
		// 단을 입력해서 출력해보자
		Scanner s = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		int dan = s.nextInt();
		for (int no = 1; no <= 9; no++) {
			System.out.printf("%d X %d = %d\n", dan, no, dan * no);
		}

	}
}
