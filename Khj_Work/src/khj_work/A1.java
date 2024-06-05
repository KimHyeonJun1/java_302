package khj_work;

class A {

	int m;
	void method() {
		
		System.out.println("A 클래스의 값 : " + m);
	}
}
	
	public class A1 {
		public static void main(String[] args) {
			A a = new A();
			a.m = 5;
			System.out.println(a.m);
			a.method();
		}
	}

