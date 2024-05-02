
public class VariableEx03 {
	public static void main(String[] args) {
		//두 컵에 담긴 데이터를 바꿔 담기
		int cup1 = 15, cup2 = 5;
		System.out.printf( "cup1: %d, cup2: %d\n", cup1, cup2);
		
		int cup3 = cup2;
		cup2 = cup1;
		cup1 = cup3;
		System.out.printf("cup1: %d, cup2: %d\n", cup1, cup2);
		
	}

	
}
