package dataIO;

import java.io.*;

public class DataOutputMainEx0 {
	public static void main(String[] args) {
		String filename = "Double";

		DataOutputStream out = null;
		try {
			out = new DataOutputStream(new FileOutputStream(filename));
			double data[] = { 1.1, 2.1, 3.1, 4.1, 5.1 };
			for (double su : data) {
				out.writeDouble(su);
			}
		} catch (IOException e) {

		} finally {
			System.out.println("저장된 파일크기: " + out.size());
			if (out != null) {
				try {
					out.close();
				} catch (Exception e) {
				}
			}
		}
		System.out.println("쓰기 완료");
		DataInputStream in = null;
		try {
			in = new DataInputStream(new FileInputStream(filename));
			while(true) {
				double no = in.readDouble();
				System.out.println(no);
			}
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
		}finally {
				if(in != null) {
					try {
						in.close();
					}catch (Exception e) {
						
					}
				}
				System.out.println("읽기 완료");
			}
		}
		
		
	}

