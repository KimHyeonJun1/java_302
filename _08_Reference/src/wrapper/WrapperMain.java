package wrapper;

public class WrapperMain {
	public static void main(String[] args) {
		//기본데이터 타입: 프리미브타입
		//래퍼런스(참조)타입 : wrapper클래스
		//byte short int     long float double char      boolean =프리미브타입
		//Byte Short Integer Long Float Double Character Boolean =레퍼런스타입
		
		int sum =0;
		for( String data : args) {
			System.out.println(data);
			//문자열 10 -> 숫자 10
			sum += Integer.parseInt(data); //리턴타입 int
			sum += Integer.valueOf(data); //리턴타입 Integer -> int : UnBoxing
		}
		System.out.println("sum> " + sum);
		Byte b = new Byte( (byte)10 );
		System.out.println(b);
		
		Integer no = new Integer(10);
		System.out.println(no);
		int no1 = no; // Integer -> int : UnBoxing
		int no2 = no.intValue();
		
		Integer no3 = no2; // int --> Integer: Auto Boxing 자동래핑
		
	}
}
