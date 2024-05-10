package _02_Control;

public class LoopEx06 {
	public static void main(String[] args) {

		// 직각삼각형
//		*****
//		****
//		***
//		**
//		*
//		for(int row=1; row<=5; row++) {
//			for(int col=1; col<=6-row; col++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}      방법 1

//		for(int row=1; row<=5; row++) {
//			for(int col=row; col<=5; col++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}  // 방법 2

		for (int row = 1; row <= 5; row++) {
			for (int col = 5; col >= row; col--) { // 5<=1:T
				System.out.print("*");
			}
			System.out.println();
		} // 방법 3

	}
}