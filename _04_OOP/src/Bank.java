
public class Bank {
	String name, number;
	int money;

	void plusMoney(int amt) {
		money += amt;
	}

	int minusMoney(int amt) {
		//통장 잔고보다 출금액이 많으면 출금은 안됨
		if( money < amt) return 0;
		money -= amt;
		return amt;
	}
}