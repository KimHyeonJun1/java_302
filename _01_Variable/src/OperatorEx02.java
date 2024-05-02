
public class OperatorEx02 {
	public static void main(String[] args) {
		
		int no1 = 30, no2 =2, result;
		result = no1 + no2;
		String no4 = "+";
		String no5 = "=";
		System.out.printf("%d %s %d %s %d \n", no1, no4, no2, no5, result);
		
		result = no1 - no2;
	    no4 = "-" ;
		System.out.printf("%d %s %d %s %d \n", no1, no4, no2, no5, result);
		
		result = no1 * no2;
		no4 = "*" ;
		System.out.printf("%d %s %d %s %d \n", no1, no4, no2, no5, result);
		
		result = no1 / no2;
		no4 = "/" ;
		System.out.printf("%d %s %d %s %d \n", no1, no4, no2, no5, result);
		
		result = no1 % no2;
		no4 = "%" ;
		System.out.printf("%d %s %d %s %d \n", no1, no4, no2, no5, result);
		
	}
}
