package viewEx02;

import java.util.Scanner;



public class StudentMain {
	static Student[]list = new Student[30];
	static int seq;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1. 정보입력화면: ");
			System.out.println("2. 정보목록조회: ");
			System.out.println("3. 닫기: ");
			
			int menu = scan.nextInt();
			if(menu == 1) {
				new RegisterView(scan);
				
			}else if (menu == 2) {
				new ListView();
			}else if(menu == 3) {
				break;
			}
		
		}
		scan.close();
		
		
		
		//홍길동 학생정보 등록
		Student hong = new Student("홍길동", "남");
		  //박문수 학생정보 등록
		Student park = new Student("박문수", "남", "010-1234-5678");
		
		info(hong);
		info(park);
	}
	
	static void info(Student who) {
		System.out.println("학번: " + who.id);
		System.out.println("학생명: " + who.name);
		System.out.println("성별: " + who.gender);
		System.out.println("전화번호: " + who.phone);
		System.out.println("---------");
	}
}
