package message;

abstract public class MessageSender {
	String title, content, senderName;
MessageSender(String title, String content, String senderName){
		this.title = title;
		this.content = content;
		this.senderName = senderName;
	}
	
	
	
	
	abstract void sendMessage(String receiver);
	
	
}
