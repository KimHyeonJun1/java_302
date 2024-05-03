package _02_Control;

public class IfEx06 {
	public static void main(String[] args) {
		//정수: 양의정수, 음의정수, 0
		//어떤수가 양의정수/음의정수/0 인지 출력하기
		
		int number = 1;
		if( number > 0) {
			System.out.println(number + "은 양의정수");
		}else if( number < 0) {
			System.out.println(number + "은 음의정수" );
		}else {
			System.out.println(number + "은 0");
		}
		
		
	}
}
