package mail;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;

public class EmailSender {
	
	void sendHtmlMail(String name, String email) {
		HtmlEmail mail = new HtmlEmail();
		mail.setCharset("utf-8");
		mail.setDebug(true);
		
		mail.setHostName("smtp.naver.com");
		mail.setAuthentication("6389301@naver.com", "메일비번적는곳" ); //보내는이의 메일서버에 로그인
		mail.setSSLOnConnect(true);//로그인 버튼 클릭
		
		try {
			//송신자
			mail.setFrom("6389301@naver.com", "행운관리자");
			
			//수신자
			mail.addTo(email, name);
			
			//제목
			mail.setSubject("행운 쿠폰 당첨");
			
			//내용
			StringBuffer msg = new StringBuffer();
			msg.append("<h2>행운 쿠폰 당첨!</h2>");
			msg.append("<strong>").append(name).append("</strong>님 행운 쿠폰 당첨을 축하드립니다!");
			msg.append("<div>행운 쿠폰이 발급되었으니</div>");
			msg.append("<div>당사 <a href='https://www.naver.com/'>사이트</a> 쿠폰함을 지금 바로 확인하세요</div>");
			mail.setHtmlMsg(msg.toString());
			
			//파일 첨부하기
			EmailAttachment file = new EmailAttachment();
			file.setPath("D:\\참고.hwp");
			mail.attach(file);
			file = new EmailAttachment();
			file.setURL(new URL("https://n.news.naver.com/article/005/0001703994?ntype=RANKING"));
			mail.attach(file);
			mail.send(); //메일 보내기 버튼 클릭
			
			
		} catch (EmailException e) {
		} catch (MalformedURLException e) { 
		}
	}
	
	
	
	
	void SendMail(String name, String email) {
		//메일 서버에 접속하기
		SimpleEmail mail = new SimpleEmail();
		mail.setCharset("utf-8");
		mail.setDebug(true);
		
		
		mail.setHostName("smtp.naver.com"); //메일서버지정
		mail.setAuthentication("6389301@naver.com", "메일비번적는곳"); //보내는이 정보
		mail.setSSLOnConnect(true); //로그인 버튼 클릭
		
		
		//보내는이 정보 : 관리자
		try {
			mail.setFrom("6389301@naver.com", "김현준");
			
			//받는이 정보 
			mail.addTo(email, name);
//			mail.addTo(email, name);
			
			//메일 제목
			mail.setSubject("역대급 행운 당첨");
			
			//메일 내용
			StringBuffer msg = new StringBuffer();
			msg.append(name + " 고객님! \n");
			msg.append("역대급 행운에 당첨되셨습니다. \n");
			msg.append("지금 바로 일주일간 집에서 쉬세요. \n");
			mail.setMsg(msg.toString());
			
			//메일 보내기 버튼 클릭
			mail.send();
			
			
		} catch (EmailException e) {
		}
		
		
		
		
	}
	
}
