package viewEx02;

import java.util.Scanner;



public class RegisterView {
	RegisterView (Scanner scan){
		System.out.println("정보입력화면-------");
		System.out.println("학생명: ");
		String name = scan.next();
		System.out.println("성별: ");
		String gender = scan.next();
		System.out.println("전화번호: ");
		String phone = scan.next();
		System.out.println("---------");
		
		Student student = new Student(name, gender, phone);
		StudentMain.list[StudentMain.seq++] = student;
	}
}
