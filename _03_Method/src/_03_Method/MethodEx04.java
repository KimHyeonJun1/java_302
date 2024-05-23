package _03_Method;

public class MethodEx04 {
	// 어떤 수가 3의 배수인지 아닌지 판단하여 출력할 메소드 선언하고 호출하기
	// 출력문은 main 메소드에서
	static int oddEven(int no) {
		int a =0;
	if(no%3==0){
		a = 0;
		//System.out.printf("%d은 3의 배수", no);
	}else
		//System.out.printf("%d은 3의 배수가 아님", no);
		a = 1;
	return a;
}
	
	static String addEven(int no) {
		String a;
		if(no % 3 ==0) {
			a = "3의 배수";
		}else {
			a = "3의 배수가 아님";
		}
		 return a;
	}
	
	static int bddEven(int no) {
		int mod = no %3;
		return mod;
	}
	
	
	
		public static void main(String[] args) {
		int no = 16;
		int a = oddEven(no);
		System.out.println( a==0 ?  no +"이면 3의 배수" : no +"이면 3의 배수가 아님");
//		if(a ==0) {
//			System.out.println( no +"이면 3의 배수");
//			
//		}else
//		System.out.println( no + "이면 3의 배수가 아님");}
		//String result = oddEven(no);
		//System.out.println(result);
		
		
		String result = addEven(no);
		System.out.println(no + "은 " + result);
		
		int s = bddEven(no);
		
		System.out.println(no+ ": " 
							+ (s==0 ? "3의 배수" : "3의 배수 아님") );
		}
		
}
