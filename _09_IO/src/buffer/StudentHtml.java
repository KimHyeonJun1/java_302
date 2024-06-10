package buffer;

import java.io.IOException;
import java.io.PrintWriter;

public class StudentHtml {
	public static void main(String[] args) {
		String filename = "학생정보.html";
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(filename);
//			writer.print("성명 \t자바 \tCSS \tHTML \n");
//			writer.printf("%s \t%d \t %d \t %d \n", "홍길동", 81, 68, 90);
//			writer.printf("%s \t%d \t %d \t %d \n", "심청", 88, 98, 60);
			writer.print("<html>");
			writer.print("<body>");
			writer.println("<h2>학생정보</h2>");
			writer.println("<table border='1'>");
			writer.println("<colgroup><col width='120px'>"
							+ "<col width='100px'><col width='100px'>"
							+ "<col width='100px'></colgroup>");
			writer.println("<tr><th>성명</th><th>성별</th>"
							+ "<th>전화번호</th><th>HTML</th></tr>");
			writer.printf("<tr><td>%s</td><td>%d</td><td>%d</td><td>%d</td></tr>"
							, "홍길동", 81, 68, 90);
			writer.printf("<tr><td>%s</td><td>%d</td><td>%d</td><td>%d</td></tr>"
							, "심청", 88, 98, 60);			
			writer.println("</table>");
			writer.print("</body>");
			writer.print("</html>");
			
		}catch(IOException e) {
		}finally {
			writer.close();
		}

		
		
	}
}
