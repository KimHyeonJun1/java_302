package d0527;

public class GuestBookMain {
	public static void main(String[] args) {
		
		GuestBook hong = new GuestBook("호텔","홍길동", "0527", "호텔에서의 하룻밤");
		GuestBook jong = new GuestBook("길바닥", "김종덕", "오늘", "길바닥에서 숨쉰채로 발견");
		GuestBook park = new GuestBook("오리", "박문수", "0527", "오리라는 동물");
		Info(hong);
		Info(jong);
		Info(park);
		
		GuestBook[] list = new GuestBook[10];
		list[0] = hong;
		list[1] = jong;
		list[2] = park;
		list(list);
	}
	
	static void list (GuestBook[]list){
		System.out.println("번호 \t제목 \t작성자 \t작성일자 \t내용");
		for( GuestBook GuestBook : list) {
			if(GuestBook == null) continue;
			System.out.print(GuestBook.number + "\t");
			System.out.print(GuestBook.title + "\t");
			System.out.print(GuestBook.writer + "\t");
			System.out.print(GuestBook.datewriter + "\t");
			System.out.print(GuestBook.detail + "\t");
			System.out.println();
		}
	}
	
	static void Info(GuestBook GuestBook) {
		System.out.println("글번호: " + GuestBook.number);
		System.out.println("제목: " + GuestBook.title);
		System.out.println("작성자: " + GuestBook.writer);
		System.out.println("작성일자: " + GuestBook.datewriter);
		System.out.println("내용: " + GuestBook.detail);
		
	}
}
