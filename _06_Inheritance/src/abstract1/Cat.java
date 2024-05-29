package abstract1;

public class Cat extends Animal {
	//String kind;
	Cat(String kind){
	//	this.kind = kind;
		super(kind);
		
	}
//	void sound() {}
	void sound() {
		System.out.println("미친" +kind + " 야아아아옹옹");
	}
}
