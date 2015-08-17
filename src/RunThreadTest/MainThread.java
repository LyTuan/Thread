package RunThreadTest;

public class MainThread {
	public static void main(String avgs[]){
		RunThread thread1 = new RunThread("Thread 1");
		RunThread thread2 = new RunThread("Thread 2");
		RunThread thread3 = new RunThread("Thread 3");
		thread3.setPriority(1);
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}
