
public class BankMain {
		public static void main(String[] args) {
			
			Bank kim = new Bank();
			
			kim.name = "김현준";
			kim.number = "351-0857-1807-83";
			kim.money = 0;
			
			System.out.println("예금주 :" + kim.name);
			System.out.println("계좌번호 :" + kim.number);
			System.out.println("잔액 :" + kim.money);
			
			//5만원 입금하기
			
			kim.plusMoney(50000);
			System.out.println("예금주 :" + kim.name);
			System.out.println("계좌번호 :" + kim.number);
			System.out.println("잔액: " + kim.money);
			
	//		3만원 출금하기
			int out = kim.minusMoney(30000);
			System.out.println("예금주 :" + kim.name);
			System.out.println("계좌번호 :" + kim.number);
			System.out.println("잔액: " + kim.money);
			
			
			System.out.println("---------");
			
		//	Bank who = new Bank();
			Bank park = new Bank();
			park.name = "박종덕";
			park.number = "111-2222-3333-83";
			park.money = 0;
			//박씨가 3만원 입금
			park.plusMoney(30000);
			//10만원 출금
			park.minusMoney(100000);
			int request = 100000;
			int output = park.minusMoney(request);
			
			System.out.printf("예금주: %s 계좌번호: %s 잔액: %d\n", park.name, park.number, park.money);
			bankInfo(park,50000,true);
			bankInfo(park,30000,false);
			bankInfo(park,10000,false);
			System.out.printf("예금주: %s 계좌번호: %s 잔액: %d\n", park.name, park.number, park.money);
			
		}
		
		static void bankInfo(Bank who, int amt, boolean in) {
			if(in) {
				who.plusMoney(amt);
			}else {
				who.minusMoney(amt);
			}
			System.out.printf("%d원을 %s 총액: %d \n", amt, in? "입금":"출금", who.money);
		}
			
		
//		
//		static void howMoney(Bank who, int money) {
//			System.out.println("예금주 :" + who.name );
//			System.out.println("계좌번호 :" + who.number);
//			System.out.println(money + "만원 입금");
//			System.out.println("잔액: "+money +"만원");
//		}
//		static void howMoney(int money, Bank who) {
//			System.out.println("예금주 :" + who.name );
//			System.out.println("계좌번호 :" + who.number);
//			System.out.println(money + "만원 출금");
//			System.out.println("잔액: "+money +"만원");
//		}
}
