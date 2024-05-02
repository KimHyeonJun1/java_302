
public class VariableEx02 {
	public static void main(String[] args) {
		
		int hour =12;
		int minute =32;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");
		System.out.printf("%d시간 %d분\n",hour, minute);
		System.out.printf("%s%d%s", "총",totalMinute,"분" );
		
	}

}
