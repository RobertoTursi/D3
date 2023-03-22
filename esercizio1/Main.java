package esercizio1;

public class Main {
	public static void main(String[] args) {
		CustomThread c1 = new CustomThread("*");
		CustomThread c2 = new CustomThread("#");
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		t1.start();
		t2.start();
	}
}
