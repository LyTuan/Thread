package SynchronationTest;

public class TestClass extends Thread{
	int count = 0;
	public void run(){
		count++;
		System.out.println(count);
	}
}
