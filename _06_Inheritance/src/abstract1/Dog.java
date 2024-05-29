package abstract1;

public class Dog extends Animal {
	//String kind;
	Dog(String kind){
		super (kind);
	//	this.kind = kind;
	}
	
	void sound() {
		System.out.println("미친" + kind + " ㅓㅁ엄ㅇ멍ㅁㅇ멍");
	}
	
}
