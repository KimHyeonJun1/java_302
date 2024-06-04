package weather;

import java.util.Scanner;

public class MonthlyMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 월?");
		int month = scan.nextInt();
		MonthlyInfo info = new MonthlyInfo(month);
		System.out.printf("%d월은 %s이고 날씨 특징은 %s", month, info.getSeason(), info.getWeather());
		
	}
}
