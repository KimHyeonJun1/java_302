package d0527;

public class Limit {
	
	static final int upper = 100000;
	int no;
	//어떤 수가 사한을 넘어서면 상한으로 지정하자
	
	void setNo(int no) {
		if(no > upper)
		this.no = upper;
		else
			this.no = no;
		
	}
	
	
}
