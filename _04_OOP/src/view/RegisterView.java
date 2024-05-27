package view;

import java.util.Scanner;

public class RegisterView {
	//키보드로 입력하기
	//방명록 글 객체를 생성해서 배열변수에 주소담기
	
	
	RegisterView (Scanner scan){
		
		
		
		
		System.out.println("글쓰기화면-------");
		System.out.println("제목: ");
		String title = scan.next();
		System.out.println("내용: ");
		String content = scan.next();
		System.out.println("작성자: ");
		String writer = scan.next();
		System.out.println("---------");
		
		Board board = new Board(title, content, writer, "24-05-27");
		BoardMain.list[BoardMain.seq++] = board;
	}
}
