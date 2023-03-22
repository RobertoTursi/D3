package esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> arrayOfNumber = new ArrayList<Integer>();
		int result = 0;
		for(int i = 0; i < 3000; i++) {
			int num = (int) Math.round(Math.random() * 100);
			result += num;
			arrayOfNumber.add(num);
		}
		
//		System.out.println("somma:" + result);
//
//		for(int i = 0; i < arrayOfNumber.size(); i++) {
//			System.out.print(arrayOfNumber.get(i) + " ");
//		}
		
//		System.out.println();
		CustomThread c1 = new CustomThread(arrayOfNumber, 0);
		CustomThread c2 = new CustomThread(arrayOfNumber, 1);
		CustomThread c3 = new CustomThread(arrayOfNumber, 2);
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		
		c1.run();
		System.out.println();
		c2.run();
		System.out.println();
		c3.run();
		System.out.println();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(sumOfPartial(c1.getPartial(), c2.getPartial(), c3.getPartial()));
	}
	
	public static int sumOfPartial(int r1, int r2, int r3) {
		return r1 + r2 + r3;
		
	}
}
