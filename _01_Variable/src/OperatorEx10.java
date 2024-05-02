import java.util.Scanner;

public class OperatorEx10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in);
		System.out.println("당신의 나이는?");
		
		int age = scan.nextInt();
	
		String grade = age < 6 ? "유아"
				: (age < 12  ? "소아"
						: ( age < 19 ? "청소년" : "성인") ) ;
				System.out.printf( "%d세인 당신은 %s입니다", age, grade);
				
	}
}
