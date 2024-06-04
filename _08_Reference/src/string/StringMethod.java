package string;

public class StringMethod {
	public static void main(String[] args) {
		String text = "혼자서도 열심히 공부하는 다른 차원의 김현준";
		System.out.println("문자열의 길이: " + text.length());
		//문자열의 일부 : substring
		System.out.println(text.substring(5,9));
		System.out.println(text.substring(4));
		
		//특정문자열이 있는 시작위치
		System.out.println(text.indexOf("공부"));
		
		//이메일 아이디만 출력하기
//		String email = "6389301@naver.com"; //6389301 -> naver.com
//		 email = "admin@naver.com"; //admin  // admin -> grd.go.kr
//		 email = "240604yo@naver.com"; // 240604yo // 240604yo ->gmail.com
		String emails[] = {"6389301@naver.com", "admin@grd.go.kr","240604yo@gmail.com"
				
		};
		
		for(String email : emails) {
			System.out.println(email.substring(0, email.indexOf("@")));	
		}
		for(String email : emails) {
			//@ 뒤만 출력하기
			// naver.com // hrd.go.kr // gmail.com
			System.out.println(email.substring(email.indexOf("@")+1));
		}
	
		for(String email : emails) {
			System.out.println(email.substring(email.indexOf("@")+1, email.length()));
		}
		
		String lastName = "홍", firstName = "길동";
		System.out.println(lastName.concat(firstName)); //문자열결합 concat
		
		String name = " 홍길동 ";
		System.out.println(name.trim()); //공백제거 trim
		
		//특정 문자열을 바꿔서 반환 replace
		System.out.println(text.replace("자", "ja"));
		
		String phone = "010-1234-5678-12345";
//		phone = "02-1234-5678-12345";
//		phone = "062-1234-5678-12345";
		System.out.println(phone.substring(phone.lastIndexOf("-")+1) );
		System.out.println(phone.substring(0, phone.indexOf("-")));
		
		phone = "062-1234-5678";
		String phones[] = phone.split("-");
		for(String p :phones) {
			System.out.println(p);
		}
		
		System.out.println(phone.join("@", phones));	
	}
}
