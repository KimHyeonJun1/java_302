package _03_Method;

public class Caculator {
	public static void main(String[] args) {
		//1. 1 + 20
		double result = plus(1, 20);
		System.out.println("1 + 20 = " + result);
		//2. 1의 결과에 *30
		result = multply(result, 30);
		System.out.println("(1 + 20) * 30 = " + result);
		
		//3. 2의 결과 / 4
		result = divide(result, 4);
		System.out.println("( (1 + 20) * 30) / 4 = " + result);
		
		//4. 3의 결과 - 5
		result = minus(result, 5);
		System.out.println("( ( (1 + 20) * 30) / 4 ) - 5 = " + result);

		//5. 4의 결과 + 45
		result = plus(result, 45);
		System.out.println("( ( ( (1 + 20) * 30) / 4 ) - 5 ) + 45 = " + result);
		//최종 계산 결과?
	}
	//덧셈
	
	
	//뺄셈
	static double minus(double no1, int no2) {
		double no = no1 - no2;
		return no;
	}
	
	// 나눗셈
	static double divide(double no1, double no2) {
		double no = (double)no1 / no2;
		return no;
	}
	
	// 곱셈
	static double multply(double no1, double no2) {
		double no = no1 * no2;
		return no;
	}
	
	//덧셈
	static double plus(double no1, double no2) {
		double no = no1 + no2;
		return no;
	}
}
