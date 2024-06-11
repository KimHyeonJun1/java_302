package buffer;

import java.util.Scanner;

import student.StudentDAO;
import student.StudentDTO;
import student.StudentInfo;
import student.StudentList;

public class StudentMVCMain {
	public static void main(String[] args) {
		
		//파일(DB)에서 데이터 읽어오기 :DAO
		StudentDAO dao = new StudentDAO();
		StudentDTO[] students = dao.getStudentList();
		
		//화면에 출력하기
		StudentList list = new StudentList(students);
		list.display();
		
		//선택한 학생의 정보 출력하기
		Scanner scan = new Scanner(System.in);
		System.out.println("누구 정보?");
		String name = scan.next();
		scan.close();
		
		StudentDTO dto = dao.getStudentInfo(name);
		//화면에 출력하기
		StudentInfo info = new StudentInfo(dto);
		info.display();
	}
}
