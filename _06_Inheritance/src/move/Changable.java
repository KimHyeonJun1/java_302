package move;

public interface Changable extends Resizeable, Colorable {
	//크기를 변경
	// 배경색을 변경
	//전경색을 변경
	//폰트를 변경
	void setFont(String font);
}
