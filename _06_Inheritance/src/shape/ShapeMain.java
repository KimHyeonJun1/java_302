package shape;

public class ShapeMain {
	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		
		Square s = new Square(5);
		
		Triangle t = new Triangle(5);
		shapeInfo(c);
		shapeInfo(s);
		shapeInfo(t);
	}
	static void shapeInfo(Shapable shape) {
		System.out.println("넓이: "+shape.getArea());
		System.out.println("둘레: "+shape.getAround());
		System.out.println("--------------");
	}
}
