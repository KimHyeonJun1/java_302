package d0523;

public class Bank {
	String name, number;
	int money;

	
	
//this : 클래스 자기자신
		//생성자/메소드의 파라미터 변수명과 필드명이 같다면
	//	필드를 구분하기 위해 필드앞에 this 키워드를 붙인다
	// 	생성자에서 다른 생성자를 호출시 this 키워드를 붙인다
//생성자
	
	Bank(String name, String number){
		this.name = name;
		this.number = number;
	}
	
	Bank(String name, String number, int money){
//		this.name = name;
//		this.number = number;
		this(name, number);
		this.money = money;
	}
	
	
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