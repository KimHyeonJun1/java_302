package _03_Method;

import java.util.Scanner;

public class MethodEx05 {
//1부터 키보드로 입력한 수까지의 합을 반환하는 메소드를 선언한 후
//main 메소드에서 1. 제시문: 몇까지의 합을 계산할 건가요?
	//		   2. 선언한 메소드를 호출하고
	//		   3. 합의 결과를 출력하기
	
	
	static int plusEx(int no) {
		int sum = 0;
        for(int i = 1; i <= no; i++) {
            sum += i;
        }
        return sum;
	}
	
	
	public static void main(String[] args) {
		System.out.println("몇까지의 합을 계산할 건가요?");
		Scanner s = new Scanner(System.in);
		int result = s.nextInt();
		int a = plusEx(result);
		System.out.printf(result + "까지의 합은 " + a);
	}
	
	
}


