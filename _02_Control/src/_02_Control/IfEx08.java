package _02_Control;

public class IfEx08 {
	public static void main(String[] args) {
//		     일반인     청소년     어린이
//	일반버스  1,250원   1,000원    500원	
		int age = 5; //나이변수
		int charge = 0; //요금변수
		String ageGroup = "소아";
		if(age >= 19) {
			charge = 1250;
			ageGroup = "일반인";
		}else if( age >= 13) {
			charge = 1000;
			ageGroup = "청소년";
		}else if (age >= 6 ) {
			charge = 500;
			ageGroup = "어린이";
		}else {
			ageGroup = "소아";
		}
		
		System.out.printf("나이 %d세인 당신의 고객님의 버스요금(%s)은 %d원 입니다", age, ageGroup, charge);
		
	}

}
