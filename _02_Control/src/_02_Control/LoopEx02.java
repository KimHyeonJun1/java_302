package _02_Control;

public class LoopEx02 {
	public static void main(String[] args) {
		// 구구단 2단~ 19단 출력

		for (int by = 2; by <= 19; by++) {
			System.out.printf("%d단\n", by);
			for (int no = 1; no <= 9; no++) {
				System.out.printf("%d X %d = %d\n", by, no, by * no);

			}
		}
	}
}
