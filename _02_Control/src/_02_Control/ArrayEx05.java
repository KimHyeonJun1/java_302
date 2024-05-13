package _02_Control;

public class ArrayEx05 {
	public static void main(String[] args) {

		int no[] = new int[5]; // 배열변수 선언
		for (int idx = 0; idx < no.length; idx++) {
			no[idx] = 10 * (idx+1);
		}
		int sum = 0;
		for (int idx = 0; idx < no.length; idx++) {
			sum += no[idx];
		}
		System.out.printf("합 : %d", sum);

	}
}
