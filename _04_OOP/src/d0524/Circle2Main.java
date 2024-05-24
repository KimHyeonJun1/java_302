package d0524;

public class Circle2Main {
	public static void main(String[] args) {
		
		Circle2 c = null;
		//반지름 10인 원 만들기
		int radius = -10;
		try {
		c = new Circle2(radius);
		//원의 넓이 구하기
//		double area = c.calculateArea();
		System.out.println("원의 반지름:" + c.getRadius());
//		c.radius = 5; //이런식으로 필드에 직접 접근해 데이터를 변경하지 못하게 접근제한하게 하자
		System.out.println("원의 넓이:" + c.calculateArea());
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		radius = 10;
		try {
			c = new Circle2(radius);
			//원의 넓이 구하기
//			double area = c.calculateArea();
			System.out.println("원의 반지름:" + c.getRadius());
//			c.radius = 5; //이런식으로 필드에 직접 접근해 데이터를 변경하지 못하게 접근제한하게 하자
			System.out.println("원의 넓이:" + c.calculateArea());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}
	
}
