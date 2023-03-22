package esercizio2;

import java.util.List;

public class CustomThread implements Runnable{

	List<Integer> arr;
	int id;
	int res = 0;
	public CustomThread(List<Integer> arr, int id) {
		this.arr = arr;
		this.id = id;
	}
	
	@Override
	public void run() {
		if(this.id == 0) {
			System.out.println("somma primo thread :" + ArrayOperation(0, 1000, this.arr)); 
		}else if(this.id == 1) {
			System.out.println("somma secondo thread :" + ArrayOperation(1000, 2000, this.arr)); 
		}else if(this.id == 2) {
			System.out.println("somma terzo thread :" + ArrayOperation(2000, 3000, this.arr)); 
		}
	}
	
	public int ArrayOperation(int start, int end, List<Integer> arr) {
		
		for(int i = start; i < end; i++) {
			int n = (int) arr.get(i);
			res += n;
		}
		return res;
	}
	
	public int getPartial() {
		return res;
	}
	
}
