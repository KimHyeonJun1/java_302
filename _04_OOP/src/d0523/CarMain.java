package d0523;

public class CarMain {
	public static void main(String[] args) {
		
//		Car park = new Car();
//		park.owner = "박문수";
//		park.model = "람보르기니";
//		System.out.printf("차주: %s 차종: %s\n", park.owner, park.model);
		Car park = new Car("박문수", "람보르기니");
		int speed=0;
		park.start();
		park.stepAccel();
		System.out.println("현재 속도: " + park.speed);
		
		
		park.stepBreak();
		System.out.println("현재 속도: " + park.speed);
	
		park.stop();
	//	Car hong = new Car("K5", null);
	//	hong.owner = "홍길동";
		
		howSpeed(park);
		howSpeed(park);
		howSpeed(park);
		
		howSpeed1(park);
		howSpeed1(park);
		howSpeed1(park);
		howSpeed1(park);
		System.out.println("김현준 -------");
		Car kim = new Car();
		kim.owner = "김현준";
		kim.model = "티코";
		System.out.printf("차주: %s 차종: %s\n", kim.owner, kim.model);
		kim.start();
		howSpeed( true, kim);
		howSpeed( true, kim);
		howSpeed( false, kim);
	}
	static void howSpeed(boolean plus, Car car) {
		if(plus) {
			car.stepAccel();
		}else {
			car.stepBreak();
		}
		System.out.printf(" %s 현재 속도 : %d\n", plus? "가속" : "감속", car.speed );
	}
	static void howSpeed1(Car car) {
		car.stepBreak();
		System.out.println( "현재 속도" + car.speed);
	}
		static void howSpeed(Car car) {
			car.stepAccel();
			System.out.println( "현재 속도" + car.speed);
		}
		
}
