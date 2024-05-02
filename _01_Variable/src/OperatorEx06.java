
public class OperatorEx06 {
	public static void main(String[] args) {
		//논리연산자: 논리합연산자 ||,| 논리곱연산자 &&,& not연산자 !
		//논리합연산자: 둘 다 false 인 경우만 false
		//논리곱연산자: 둘 다 true 인 경우만 true
		//not연산자: True -> false, false -> true
		int no1 = 5, no2 =3;
		System.out.println( no1 > no2 ); // 5>5 : true
		
		int no3 = 3, no4 =5;
		System.out.println( no3 > no4); // 3> 5 : false
		
		//논리합
		 System.out.println(no1 > no2 || no3 > no4); // T || F -> T
		//점심을 먹을 수 있는지 판단: 현금O, 카드O 하나라도 있으면 점심을 먹을수있으니까 T
		 
		 
		 System.out.println( !(no1 > no2) || no3 > no4); // F || F -> F
	
		 //논리곱
		 System.out.println(no1 > no2 && no3 > no4); // T && F -> ㄹ
		 System.out.println(no1 > no2 && !(no3 > no4) ); // T && T -> T
		 
		 
		 
		 
		 
		
		
		
		
		
	}
}
