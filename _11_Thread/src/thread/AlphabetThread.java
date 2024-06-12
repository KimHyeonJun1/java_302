package thread;

public class AlphabetThread extends Thread {

	@Override
	public void run() {
		for(char ch='A'; ch<= 'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		System.out.print("main thread finished");
	}
	
	
	
}
