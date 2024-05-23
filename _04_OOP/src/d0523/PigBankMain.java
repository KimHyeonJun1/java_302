package d0523;

public class PigBankMain {
	public static void main(String[] args) {
		PigBank hong = new PigBank("홍길동"); //객체 생성문 = 생성자 호출문
		pigInfo(hong);
	}
	
	
	static void pigInfo(PigBank who) {
		System.out.println(who.owner + " 돼지저금통");
		System.out.println("현재 저금통안에 " + who.total);
	}
}
