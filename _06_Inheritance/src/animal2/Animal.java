package animal2;

public class Animal {
	String name, kind;
	
	Animal(String name, String kind){
		this.name = name;
		this.kind = kind;
	}
	
	
	
	void eat() {
		System.out.println( name + " 먹는다");
	}
	
	void sleep() {
		System.out.println(name + " 잠을 잔다");
	}
	
	
}
