package d0527;

public class Accumulator {
	//로컬변수:local 지역변수, 전역변수: global
	static int gTotal;
	int total;
	void accumulate(int no) {
		total += no;
		gTotal += no;
	}
	static int getgTotal() {
		//객체만의 구성요소에는 접근 불가
	return gTotal;
	}
}
