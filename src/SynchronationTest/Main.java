package SynchronationTest;

public class Main {
	public  static void main(String avgs[]){
		TestClass thread1 = new TestClass();
		thread1.start();
		TestClass thread2 = new TestClass();
		thread2.start();
		
	}
}	
