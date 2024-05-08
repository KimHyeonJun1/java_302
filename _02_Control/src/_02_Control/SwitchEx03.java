package _02_Control;

public class SwitchEx03 {
	public static void main(String[] args) {
		//3의 배수(3으로 나눈 나머지가 0)인지 아닌지 출력하기
		//0,1,2
		int no = 5;
		//if( no % 3 == 0){else if() {no % 3 ==1 || no % ==2}} : if로 쓴다면 예시
		switch (no % 3) {
		case 0:
			System.out.println(no + "는 3의 배수");
			break;
		case 1:
		case 2:
		//default:   <-- case1, case2 대신 default 사용 가능
			System.out.println(no + "는 3의 배수아님");
			 
		}
		
		
	}
}
