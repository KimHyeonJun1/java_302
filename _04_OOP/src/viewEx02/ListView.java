package viewEx02;


public class ListView {
	ListView(){
		System.out.println("학번 \t학생명 \t성별 \t전화번호 \t");
		for(Student student: StudentMain.list) {
			if(student == null) continue;
			System.out.print(student.id + "\t");
			System.out.print(student.name + "\t");
			System.out.print(student.gender + "\t");
			System.out.print(student.phone + "\t");
			System.out.println();
		}
	}
	
}
