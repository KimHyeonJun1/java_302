package message;

public class SmsSender extends MessageSender {
	String phone;
	SmsSender(String title, String content, String senderName, String phone){
		super(title, content, senderName);
		this.phone = phone;
	}
	
	void sendMessage(String receiver) {
		System.out.println("-----Sms 발송-----");
		System.out.println("통신사 서버에 접속");
		System.out.println("제목: "+ title);
		System.out.println("보내는이: "+ senderName + "[" + phone +"]");
		System.out.println("받는이: "+ receiver);
		System.out.println("Sms 내용: "+ content);
		System.out.println("------------------");
	}
}
