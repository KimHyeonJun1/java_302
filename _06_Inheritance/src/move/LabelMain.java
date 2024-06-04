package move;

public class LabelMain {
	public static void main(String[] args) {
		Label label = new Label("짱종덕 얼굴넓이", 200 , 80, "DeepRed", "DeepBlack", "정열체");
		info(label);
		label.resize(30, 500);
		label.setForegroundColor("black");
		label.setBackroundColor("red");
		label.setFont("어두운고딕");
		info(label);
	}
	static void info(Label label) {
		System.out.printf("%s : %d X %d 배경색(%s) 전경색(%s) 폰트(%s)", 
				label.text, label.width, label.height,label.background,label.foreground,label.font);
		System.out.println();
	}
}
