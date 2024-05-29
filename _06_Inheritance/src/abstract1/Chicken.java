package abstract1;

public class Chicken extends Animal {
	//String kind;
	Chicken(String kind){
		super(kind);
//		this.kind = kind;
	}
	
	
	void sound() {
		System.out.println("미친" + kind + " 꼬꼬꼬꼬꼮");
	}
}
