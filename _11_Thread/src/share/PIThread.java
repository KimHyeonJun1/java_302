package share;

public class PIThread extends Thread {
	ShareData share;
	
	PIThread(ShareData share){
		this.share = share;
	}
	
	@Override
	public void run() {
		//원주율 계산
	double total = 0;
	for(int no=1; no<1000000000; no+=2) { // no는 2씩 증가
		if(no / 2 % 2 == 0) total += 1.0 /no;
		else        	    total -= 1.0 /no;
	}
	total *=4; // 계산된 원주율값
		share.pi = total;
		System.out.println("원주율 계산 완료!");
	}

	
	
	
}
