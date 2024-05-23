
public class PigBankMain {
	public static void main(String[] args) {
		//돼지저금통만들기 - 객체생성
		//PigBank hong; // null
		//hong = new PigBank();
		PigBank hong = new PigBank();
		hong.owner = "홍길똥";
		System.out.println("저금통 주인: "+ hong.owner);
		System.out.println("저금통 총액: " + hong.total);
		
		int money;
		
		money =1000;
		hong.inputMoney(money);
		System.out.println(money + "원 넣어 저금통 총액: " + hong.total);
		
		money = 2000;
		hong.inputMoney(money);
		System.out.println(money + "원 넣어 저금통 총액: " + hong.total);
		
		money = 5000;
		hong.inputMoney(money);
		System.out.println(money + "원 넣어 저금통 총액: " + hong.total);
		
		howMuch(500, hong);
		
		money = 1500;
		hong.ouput_money(money);
		System.out.println(money + "원 빼서 저금통 총액: " + hong.total);
		
		money = 3000;
		hong.ouput_money(money);
		System.out.println(money + "원 빼서 저금통 총액: " + hong.total);
		
		howMuch(hong, 3000);
		
//		String owner;
//		int total=0;
//		owner = "홍길똥";
//		System.out.println("저금통 주인: "+ owner);
//		System.out.println("저금통 총액: "+ total);
		
		//심청 의 저금통 준비하기
		PigBank sim = new PigBank();
		System.out.println("심청의 저금통 --------");
		//5000 넣기
		howMuch(sim, 5000, true);
		//1000 넣기
		howMuch(sim, 1000, true);
		//2000 빼기
		howMuch(sim, 2000, false);
		//500 빼기
		howMuch(sim, 500, false);
		
	}
	
	static void howMuch(PigBank who, int money, boolean in) {
		if(in) {
			who.inputMoney(money);
		}else {
			who.ouput_money(money);
		}
		System.out.printf("%d원 %s 저금통 총액 : %d\n",money, in? "넣어" : "빼서", who.total );
	}
	
	static void howMuch(PigBank hong, int money) {
		hong.ouput_money(money);
		System.out.println(money + "원 빼서 저금통 총액: " + hong.total);
	}
	
	static void howMuch(int money, PigBank hong) {
		hong.inputMoney(money);
		System.out.println(money + "원 넣어 저금통 총액: " + hong.total);
	}
}
