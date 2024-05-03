package _02_Control;

public class IfEx05 {
	public static void main(String[] args) {
		//성적에 따른 학점 출력하기
		//성적을 담을 변수
		int score = 60;
		if( score >= 90) {				// 55 >= 90 : F
			System.out.println("A학점"); // 55 >= 80 : F
		}else if( score >= 80) {
			System.out.println("B학점"); // 55 >= 70 : F
		}else if( score >= 70) {
			System.out.println("C학점"); // 55 >= 60 : F
		}else if( score >= 60) {
			System.out.println("D학점"); 
			//else if( score < 60) { 55 < 60 : T
		}else{  	//위 4가지 경우에 해당하지 않는다면
			System.out.println("F학점");
		}
		
		
		
		
	}
}
