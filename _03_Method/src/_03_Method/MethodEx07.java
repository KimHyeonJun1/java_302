package _03_Method;

public class MethodEx07 {

	// 두 수 까지의 정수를 출력하는 처리

	static void between2(int no1, int no2) {
		//no1 =5, no2 =1 -> no3 = no1, no1=no2, no2=no3
		if(no1 > no2) {
			
			int no3;
			no3 = no1;
			no1 = no2;
			no2 = no3;
		}
		
		
		
		
		for (int no = no1; no <= no2; no++) {
			System.out.print(no + " ");
		}
		System.out.println();
	}

	static void between(int no1, int no2) {
		if (no1 > no2) {
			for (int no = no2; no >= no1; no--) {
//		for(int no =no1; no<=no2; no++) {
//			System.out.print(no + " ");
//		}
				System.out.print(no + " ");
			}
		}
		if (no2 > no1)
			for (int no = no1; no <= no2; no++) {
				System.out.print(no + " ");
			}
		System.out.println();
	}

	public static void main(String[] args) {
		between2(1, 5);
		System.out.println("----------");
		between2(5, 1);
		System.out.println("----------");
		// 1 ~5 까지의 수 출력하기
//		between(1, 5); // 1, 2, 3, 4, 5
//		System.out.println("----------");
//		between2(5, 1); // 1,2,3,4,5,
//		System.out.println("----------");
//		// 10 ~25 까지의 수 출력하기
//		between(10, 25);
//		System.out.println("----------");
//		// 5 ~9까지의 수 출력하기
//		between(5, 9);
//		System.out.println("----------");
	}
}
