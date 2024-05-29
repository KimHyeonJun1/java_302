package animal2;

public class Dog extends Animal {
//	String name;
	
	
	
	Dog(String name, String kind){
		super (name, kind);
		System.out.println(name + kind);
	}
	
	
	
	void run() {
		System.out.println(name + "가 땅위를 달린다");
	}
	
}
