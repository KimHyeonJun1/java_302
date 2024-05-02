
public class CastEx01 {
	
	public static void main(String[] args) {
		
		byte b_no; 
		b_no = -127;
		
		int i_no;
		i_no = -127;
		i_no = b_no; // 암묵적 형변환 
		i_no = (int)b_no; // 명시적 형변환
		
		b_no = -127;
		b_no = (byte)i_no;
		
		System.out.println(b_no);
		
	}

}
