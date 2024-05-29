package abstract1;
//abstract 클래스는 구체화할 수 없다.
// --> 상속을 통해서만 생성이 가능하다
abstract public class Animal {
	String kind;
	Animal(String kind){
		this.kind = kind;
	}
	// 구체적인 처리를 할 수 없다면 본체{} 없이 ; 로 메소드를 선언을 끝낸다
	abstract void sound(); //{
//		System.out.println(kind + " 소리낸다");
//	}
}
