import java.util.Scanner;

public class OperatorEx10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in);
		System.out.println("나이를, 입력하세요");
		
		int age = scan.nextInt();
	
		String grade = age < 6 ? "유아"
				: (age < 12  ? "소아"
						: ( age < 19 ? "청소년" : "성인") ) ;
				System.out.printf( "나이 : %d세 -> %s", age, grade);
				
	}
}
