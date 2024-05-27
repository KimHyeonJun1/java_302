package d0527;

public class GuestBook {
	//글번호가 자동으로 부여되는 방명록 클래스 선언
	//필드선언: 공유글번호, 객체글번호, 제목, 작성자, 작성일자,내용
	//생성자선언: 파라미터 4개짜리 선언
	//2.방명록 생성할 main 있는 클래스
	//방명록 객체 생성해서 등록한 글목록 출력
	
	static int seqNumber = 1;
	
	int number;
	String title, writer, datewriter, detail;
	
	GuestBook(String title, String writer, String datewriter, String detail){
		this.number = seqNumber++;
		this.title = title;
		this.writer = writer;
		this.datewriter = datewriter;
		this.detail = detail;
	}

	
	
	
}
