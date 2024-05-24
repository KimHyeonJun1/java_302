package d0524;

public class GoodsStockMain {
	public static void main(String[] args) {
		//아디다스 가방 삼품 재고관리하기
		
//		GoodsStock adidas = new GoodsStock();
//		adidas.goodsName = "아디다스 가방";
//		adidas.goodsCode = "AD01";
//		goodInfo(adidas);
		
		GoodsStock nike =
				new GoodsStock("나이키모자", "NK01",100);
//		goodInfo(nike);
		
		GoodsStock adidas = 
				new GoodsStock("아디다스모자", "Ad01",50);
//		goodInfo(adidas);
//		//가방 10개 입고하기
//		adidas.plusStock(20);
//		goodInfo(adidas);
		
		//가방 20개 출고하기
//		int out = adidas.minusStock(30);
//		goodInfo(adidas);
//		System.out.println("출고된 수량: " + out);
//		
		int no[] = new int[2];
		System.out.println("제품명    \t제품코드 \t재고수량 ");
		GoodsStock[] goods = {nike, adidas};
		for( GoodsStock a : goods) {
			info(a);
		}
		
	}
	static void info(GoodsStock goods) {
		System.out.println( goods.getGoodsName() + "\t"+
							goods.getGoodsCode() + "\t"+
							goods.getStockAmount());
	}
	
	static void goodInfo(GoodsStock goods) {
		System.out.println("상품명: " + goods.getGoodsName());
		System.out.println("상품코드: " + goods.getGoodsCode());
		System.out.println("상품재고수량: " + goods.getStockAmount());
	}
}
