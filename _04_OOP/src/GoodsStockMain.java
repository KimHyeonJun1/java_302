
public class GoodsStockMain {
	public static void main(String[] args) {
		GoodsStock nike;
		nike = new GoodsStock();
		
		nike.goodsName = "나이키 모자";
		nike.goodsCode = "NK01";
		nike.stockAmount = 100;
		
		System.out.println("상품명: " + nike.goodsName);
		System.out.println("상품코드: " + nike.goodsCode);
		System.out.println("상품재고수량: " + nike.stockAmount);
		
		//50개만큼 입고한다
		
		nike.plusStock(50);
		System.out.println("상품명: " + nike.goodsName);
		System.out.println("상품코드: " + nike.goodsCode);
		System.out.println("상품재고수량: " + nike.stockAmount);
		//30개를 출고한다
		int out = nike.minusStock(30);
		System.out.println("상품명: " + nike.goodsName);
		System.out.println("상품코드: " + nike.goodsCode);
		System.out.println("상품재고수량: " + nike.stockAmount);
		System.out.println("출고수량" + out);
		
		//아디다스 가방 삼품 재고관리하기
		
		GoodsStock adidas = new GoodsStock();
		adidas.goodsName = "아디다스 가방";
		adidas.goodsCode = "AD01";
		goodInfo(adidas);
		
		//가방 10개 입고하기
		adidas.plusStock(10);
		goodInfo(adidas);
		
		//가방 20개 출고하기
		out = adidas.minusStock(20);
		goodInfo(adidas);
		System.out.println("출고된 수량: " + out);
	}
	
	static void goodInfo(GoodsStock goods) {
		System.out.println("상품명: " + goods.goodsName);
		System.out.println("상품코드: " + goods.goodsCode);
		System.out.println("상품재고수량: " + goods.stockAmount);
	}
}
