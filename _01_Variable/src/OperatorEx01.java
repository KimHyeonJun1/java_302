
public class OperatorEx01 {
	public static void main(String[] args) {
		//산술연산자: + - * / %
		int no1 = 10, no2 = 3;
		//변수는 사용하려면 반드시 초기화 해야만 한다.
		int plus = no1 + no2;
		System.out.printf(" %d + %d = %d\n", no1, no2, plus);
		int minus = no1 - no2;
		System.out.printf(" %d - %d = %d\n", no1, no2, minus);
		int multyply = no1 * no2;
		System.out.printf(" %d * %d = %d\n", no1, no2, multyply);
		int divide = no1 / no2; //몫
		System.out.printf(" %d / %d = %d\n", no1, no2, divide);
		divide = no1 % no2; //나머지
		System.out.printf(" %d %% %d = %d\n", no1, no2, divide);
		
		
		
	}

}
