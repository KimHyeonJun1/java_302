package _02_Control;

public class ArrayEx12 {
		public static void main(String[] args) {
//			int no[][] = { {10,20,30}, {1,2,3}, {100,200,300} };
////			//각 행열 값 출력하기 1행: 10 20 30 2행: 1,2,3 3행: 100,200,300
////			
//			String name[][] = { {"홍길동", "심청", "박문수"},{"hong", "sim", "park"}}
			
			String name[][] = { {"홍길동", "심청", "박문수"},{"hong", "sim", "park"},{"한국","일본","중국"}};
			
			for(int i=0; i<name.length; i++) {
//				System.out.println(i);
//				System.out.println(name[0]);
				System.out.printf((i + 1)+"행: ");
				for(int j=0; j<name[i].length; j++) {
					System.out.print(name[i][j] + " ");
				}
				System.out.println();
			}
		}
}
//			int no[] = {10,20,30,40};
//			System.out.println(no.length);
////			System.out.println(no[0]);
////			System.out.println(no[1]);
////			System.out.println(no[2]);
////			
//			for(int i=0; i<no.length; i++) {
//				System.out.println(no[i]);
//			}
			
//			int no[][] = { {10, 20, 30, 40}, 
//							{1, 2, 3},
//							{1, 2, 3, 4}
//							};
//			
//			System.out.println(no.length);
//			System.out.println(no[0].length);
//			System.out.println(no[1].length);
			
//			for(int i=0; i<no.length; i++) {
////				System.out.println(i);
////				System.out.println(no[i]);
//				System.out.printf((i + 1)+"행: ");
//				for(int j=0; j<no[i].length; j++) {
//					System.out.print(no[i][j] + " ");
//				}
//				System.out.println();
//			}
//		}
//}
