package d0528;

import java.util.Scanner;

import d0528.dto.GoodsInfo;
//아래두개처럼 나누든지 이렇게
//import d0528.view.GoodsList;
//import d0528.view.GoodsRegister;
import d0528.view.*;

public class GoodsInfoMain {
	static public GoodsInfo goods[] = new GoodsInfo[5];
	static public int seq;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("------------");
			System.out.println("1.상품등록   2.상품목록  3.할인율  0.종료");
			System.out.println("----------");
			int menu = scan.nextInt();
			scan.nextLine();
			if (menu == 1) {
					new GoodsRegister(scan);
			} else if (menu == 2) {
					new GoodsList();
			} else if (menu == 3) {
					new GoodsModify(scan);
			} else if (menu == 0) {
				break;
			}
		}

		scan.close();
	}// end of main
}// end of class
