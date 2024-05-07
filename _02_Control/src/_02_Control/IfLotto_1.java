package _02_Control;

import java.util.Random;
import java.util.Scanner;

public class IfLotto_1 {
	public static void main(String[] args) {
		//1~45까지의 수를 랜덤추출/수동선택
		System.out.println("로또 선택 자동/수동(0/1)?");
		Scanner scan;
		scan = new Scanner( System.in);
		int choice = scan.nextInt();
		if( choice == 0) {
			System.out.println("자동으로 추출됩니다");
			Random r = new Random();
			int lotto1 = r.nextInt(45) + 1 ; //45개의 수(0~44 + 1) -> 1~45
			int lotto2 = r.nextInt(45) + 1 ; //45개의 수(0~44 + 1) -> 1~45
			int lotto3 = r.nextInt(45) + 1 ; //45개의 수(0~44 + 1) -> 1~45
			int lotto4 = r.nextInt(45) + 1 ; //45개의 수(0~44 + 1) -> 1~45
			int lotto5 = r.nextInt(45) + 1 ; //45개의 수(0~44 + 1) -> 1~45
			int lotto6 = r.nextInt(45) + 1 ; //45개의 수(0~44 + 1) -> 1~45
			System.out.printf("%02d %02d %02d %02d %02d %02d" , lotto1, lotto2, lotto3, lotto4, lotto5, lotto6);
			
			
			
			
		}else if( choice == 1) {
			System.out.println("수동으로 선택 합니다");
			//블럭설정> ctrl + alt + 방향키
			System.out.print("1.");
			int lotto1 = scan.nextInt();
			System.out.print("2.");
			int lotto2 = scan.nextInt();
			System.out.print("3.");
			int lotto3 = scan.nextInt();
			System.out.print("4.");
			int lotto4 = scan.nextInt();
			System.out.print("5.");
			int lotto5 = scan.nextInt();
			System.out.print("6.");
			int lotto6 = scan.nextInt();
			System.out.printf("%02d %02d %02d %02d %02d %02d" , lotto1, lotto2, lotto3, lotto4, lotto5, lotto6);
			
			
		}
		
	}
}
