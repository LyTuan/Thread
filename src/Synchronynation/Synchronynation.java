package Synchronynation;

public class Synchronynation {
	int count = 0;
	public synchronized void tang(){
		count = count +1;
		System.out.println(count);
	}
}
