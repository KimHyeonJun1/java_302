package message;

public class SenderMain {
	public static void main(String[] args) {
		EmailSender email = new EmailSender("이글을 보신후 10초안에", "가장친한친구 3명에게 이문자를 보내십쇼", "돈내놔", "1234@aefaefa.com");
		email.sendMessage("adkeajkeaw@naver.com");
		
		SmsSender sms = new SmsSender("이글을 보신후 10초안에","가장친한친구 3명에게 이문자를 보내십쇼","돈내놔","010-1112-4454");
		sms.sendMessage("010-1234-5678");
	}
}
