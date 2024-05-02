
public class VariableEx01 {
	public static void main(String[] args) {
		
		int no;
		no = 10;
		
		no = no + 5;
		System.out.println( no );
		
		no = no + 50;
		System.out.println( "no: " + no );
		System.out.println( "no에는 " + no + "이 담겨있다");
		System.out.printf("%s에는 %d이 %s있다\n", "no", no, "담겨");
		//파라미터(매개변수): 매소드호출시 ()안에 담는 데이터값 
		
		
		long data;
		data = 2200000000L;
		System.out.println(data);
		
		
		double pi = 3.14;
		System.out.println( pi );

		char cup = '가';
		System.out.println( cup );
		
		String cup2 = "오늘은 개강첫날 입니다";
		System.out.println( cup2);
		
		
		boolean today;
		int firstDay = 29;
		today = firstDay == 29;
		System.out.println(today);
		
		
		
		
	}

}
