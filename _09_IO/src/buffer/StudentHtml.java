package buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentHtml {
	public static void main(String[] args) {
		//학생명단.txt 파일의 내용을 읽어 학생명단 .html 파일로 출력하기
		//학생명단.html 파일의 출력형태 는 table 목록형태로
		
		//버퍼를 이용해 문자를 읽는 BufferedReader 클래스를 사용해
				
		String htmlFile = "src/buffer/학생명단.html";
		PrintWriter writer = null;
		try {
		writer = new PrintWriter(htmlFile);
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h2>학생명단</h2>");
		writer.print("<table border ='1'>");
		writer.print("<tr><th>성명</th> <th>성별</th> <th>전화번호</th> </tr>");
		
		
		BufferedReader reader = null;
		
		String filename = "src/buffer/학생명단.txt";
		try {
		reader = new BufferedReader(new FileReader(filename));
		while(true){
		String line = reader.readLine();
		if(line == null) break;
		//line: 한신우,여,010-1234-8888
		String info[] = line.split(",");
		writer.printf("<tr><th>%s</th> <th>%s</th> <th>%s</th> </tr>",info[0],info[1],info[2]);
		
		}
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			
		}finally {
			if(reader!=null) {
				try{reader.close();}catch(Exception e) {}
			}
		}
		
		writer.print("</table>");
		writer.print("</body>");
		writer.print("</html>");
		
		}catch(IOException e) {
		}finally {
			writer.close();
		}
		/////////////////////////
		
					}		
				
	}

