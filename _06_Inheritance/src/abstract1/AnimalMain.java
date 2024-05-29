package abstract1;

public class AnimalMain {
	public static void main(String[] args) {
		
		
		Dog dog = new Dog("시베리안 허스키");
		dog.sound();
		
		Cat cat = new Cat("먼치킨");
		cat.sound();
		
		Chicken chicken = new Chicken("찜닭");
		chicken.sound();
	}
}
