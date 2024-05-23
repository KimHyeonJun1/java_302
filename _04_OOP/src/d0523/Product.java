package d0523;

public class Product {

	//실습 상품정보 클래스 Product 선언
	//필드: 상품명, 상품코드, 상품가격
	//생성자: 상풍명, 상품코드를 초기화, 모든 필드를 초기화
	//메소드:가격을 변경한다.
	//2.상품정포 객체를 생성하여 사용하는 main있는 클래스 선언
	//화장지는 상품가격까지 등록
	//종이컵은 상품가격 없이 등록 - > 가격을 1500 으로 변경
	//출력결과 화장지 Ts01
	
	String productName, productCode;
	int productPrice;
	
	Product(String name, String code){
		productName = name;
		productCode = code;
	}
	
	Product(String name, String code, int money){
		this(name, code);
		productPrice = money;
	}
	
	
	void plusProduct() {
		productPrice += 1000;
		System.out.println("가격이 1000원 올랐습니다.");
	}
	
	void changeProduct(int money) {
		
		productPrice = money;
		
		//제품가격을 내가 정한 금액으로 
					//변경되어야 한다.
		
	}
}
