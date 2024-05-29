package account2;

public class CheckCardAccount extends Account {
//	String owner, accountNo;
//	int balance;
	String cardNo;
	
	
	CheckCardAccount(){
		System.out.println("CheckCardAccount생성자");
	}
	CheckCardAccount(String owner, String accountNo, String cardNo){
//		this.owner = owner;
//		this.accountNo = accountNo;
		super (owner, accountNo);
		this.cardNo = cardNo;
	}
	CheckCardAccount(String owner, String accountNo, String cardNo, int balance){
		this(owner, accountNo, cardNo);
		this.balance = balance;
	}
	CheckCardAccount( int balance, String owner, String accountNo, String cardNo){
		super(owner, accountNo, balance);
		this.cardNo = cardNo;
	}
	
//	void deposit(int money) {
//		balance += money;
//	}
//	int withraw(int money) throws Exception {
//		if(money > balance)throw new Exception("잔고부족 출금불가");
//		balance -= money;
//		return money;
//	}
	
	//결제하기
	int pay(int money, String cardNo)throws Exception {
		if( ! cardNo.equals(this.cardNo))
			throw new Exception("결제불가 카드입니다");
		return withdraw(money);
//		if(money > balance)throw new Exception("잔고부족으로 결제불가");
//		balance -= money;
//		return money; //결제금액 알려주기
	}
	
}
