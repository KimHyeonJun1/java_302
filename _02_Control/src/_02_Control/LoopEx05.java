package _02_Control;

public class LoopEx05 {
	public static void main(String[] args) {
		// *
		// **
		// ***
		// ....

		for (int row = 1; row <= 6; row++) {
//			//row:1
//			System.out.print("*");
//			System.out.println();
//			//row:2
//			System.out.print("*");
//			System.out.print("*");
//			System.out.println();
//			//row:3
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.println();
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
