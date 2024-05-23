package d0523;

public class ProductMain {
	public static void main(String[] args) {
		
	Product papertowel = new Product("화장지", "TS01", 10000);
		goodPrice(papertowel);
//		
	Product papercup = new Product("종이컵", "PC01");
		goodPrice(papercup);
//		papercup.changeProduct(1500);
//		goodPrice(papercup);
//		
		Product water = new Product("생수", "WT01", 3000);
	int no[] = new int[3];
//	Product[] name = new Product[3];
//	Product[0] = papertowel;
//	Product[1] = papercup;
//	Product[2] = water;
	System.out.println("상품명 \t상품코드 \t가격");
	Product[] name = { papertowel, papercup, water};
	for(  Product p : name) {
		info(p);
	}
	
//	water.plusProduct();
//	goodPrice(water);
//	water.plusProduct();
//	goodPrice(water);
//	water.plusProduct();
//	goodPrice(water);
//	info(water);

	
	}
	
	static void info(Product name) {
		System.out.println( name.productName + "\t" + 
							name.productCode + "\t" +
							name.productPrice);
	}
	
	static void goodPrice(Product name) {
		System.out.println("제품명: " + name.productName);
		System.out.println("제품코드: " + name.productCode);
		System.out.println("상품가격: " + name.productPrice);
	}
	
}
