package people;

public class Student extends People {
//이름, 나이, 학번
	String studentNo;
	
	
	
	//등교한다
	void gotoSchool() {
		System.out.println( name + " 등교한다");
	}
}
