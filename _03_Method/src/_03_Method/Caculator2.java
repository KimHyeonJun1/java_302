package _03_Method;

public class Caculator2 {
	public static void main(String[] args) {
		
		//1. 1 + 20
		double result;
		result = plus(1, 20);
		System.out.printf("%.1f + %.1f = %.1f \n", 1.0, 20.0, result);
		//2. 1의 결과에 *30
		double result2 = multply(result, 30);
		System.out.printf("%.1f * %.1f = %.1f \n", result, 30.0, result2);
		//3. 2의 결과 / 4
		result = divide(result2, 4);
		System.out.printf("%.1f / %.1f = %.1f \n", result2, 4.0, result);
		//4. 3의 결과 - 5
		result2 = minus(result, 5);
		System.out.printf("%.1f - %.1f = %.1f \n", result, 5.0, result2);
		//5. 4의 결과 + 45
		result = plus(result2, 45);
		System.out.printf("%.1f + %.1f = %.1f \n", result2, 45.0, result);
		
		//최종 계산 결과?
		
	}
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
