package d0523;

public class GoodsStockMain {
	public static void main(String[] args) {
		//아디다스 가방 삼품 재고관리하기
		
//		GoodsStock adidas = new GoodsStock();
//		adidas.goodsName = "아디다스 가방";
//		adidas.goodsCode = "AD01";
//		goodInfo(adidas);
		
		GoodsStock nike =
				new GoodsStock("나이키모자", "NK01",50);
		goodInfo(nike);
		
		GoodsStock adidas = 
				new GoodsStock("아디다스모자", "Ad01",50);
		goodInfo(adidas);
		//가방 10개 입고하기
		adidas.plusStock(20);
		goodInfo(adidas);
		
		//가방 20개 출고하기
		int out = adidas.minusStock(30);
		goodInfo(adidas);
		System.out.println("출고된 수량: " + out);
	}
	
	static void goodInfo(GoodsStock goods) {
		System.out.println("상품명: " + goods.goodsName);
		System.out.println("상품코드: " + goods.goodsCode);
		System.out.println("상품재고수량: " + goods.stockAmount);
	}
}
