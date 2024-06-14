package hello;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
	public static void main(String[] args) {
		Socket client = null;
		DataOutputStream out = null;
		DataInputStream in = null;
		Scanner scan = new Scanner(System.in);
		//서버의 IP로 약속된 포트를 통해 서버에게 요청하기
		try {
			client = new Socket("192.168.0.225", 8000);//localhost ==> 자기 자신에게 해당하는 IP (192.168.0.225)
			System.out.println("서버와 연결완료");
			
//			OutputStream stream = client.getOutputStream();
//			//우리가 내보낼 문자열 -> 바이트로 변환하는 처리가 필요함
//			new DataOutputStream(stream);
			 out = new DataOutputStream(client.getOutputStream());
			 out.writeUTF(scan.nextLine());
			
			 //서버가 보낸 메시지 출력하기
			 in = new DataInputStream(client.getInputStream());
			String msg = in.readUTF();
			 System.out.println("서버로부터 수신> " + msg );
			 
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try{in.close();}catch(Exception e) {}
			try{out.close();}catch(Exception e) {}
			try{client.close();}catch(Exception e) {}
		}
		scan.close();
	}
}
