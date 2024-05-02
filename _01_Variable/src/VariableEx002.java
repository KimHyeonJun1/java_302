
public class VariableEx002 {
	public static void main(String[] args) {
		
		//상수: 절대 변하지 않는 데이터를 갖는다. - final
		//상수는 대문자로 선언하자: 암묵적규칙
				//final double PI = 3.14;
				final double PI;
				PI = 4.14;
				System.out.println( PI );
		
	//변수: 데이터를 얼마든지 바꿔 담을 수 있다.
		int hour =12;
		int minute =32;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");
		System.out.printf("%d시간 %d분\n",hour, minute);
		System.out.printf("%s%d%s\n", "총",totalMinute,"분" );
		
		
		System.out.println( PI );		
	
		
		
	}

}
