package drink;

import java.util.Scanner;

public class DrinkInfoDAO extends DrinkManage implements DrinkDAO {
	DrinkInfoDAO(DrinkDTO[] drinks, Scanner scan){
		super(drinks, scan);
	}
	
	@Override
	public void insert() {}

	@Override
	public void list() {}

	@Override
	public void info() {
		// ..............
		System.out.println("음료 정보를 선택하세요");
		int button = scan.nextInt();
		 if(drinks[button -1] == null) {
			 System.out.println("정보 없음");}
		 else {
		System.out.printf("상품명: %s\t 가격: %d\t 수량: %d\t"
				, drinks[button -1].name, drinks[button -1].price, drinks[button -1].quantity );
		 }
		 
		
				
		
		
	}

	@Override
	public void update() {}

	@Override
	public void delete() {}
	
	public void search() {
		
	}

}
