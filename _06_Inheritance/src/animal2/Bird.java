package animal2;

public class Bird extends Animal {
//	String name;
	
	
	Bird(String name, String kind){
		super(name, kind);
		System.out.println(name + kind);
	}
	
	
	void fly() {
		System.out.println(name + "가 하늘을 난다");
	}
	
	
}
