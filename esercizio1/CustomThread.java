package esercizio1;

public class CustomThread implements Runnable{
	
	String msg;
	
	public CustomThread(String msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i ++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(msg);
		}
		
	}
}
