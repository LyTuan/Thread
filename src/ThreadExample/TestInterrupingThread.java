package ThreadExample;

public class TestInterrupingThread extends Thread{
	public void run(){
		
		try{
			System.out.println("TUAN LY ");
			System.out.println("Task");
			Thread.sleep(5000);
			System.out.println("Co vao song roi moi dung");
			Thread.yield();	
		}catch(InterruptedException e){
			//System.out.println("Slepp interrupted.");
			System.out.println("In the catch! -----");
			throw new RuntimeException("Thread Interrupted:");
		}
		//System.out.println("Finish");
	}
	public static void main(String avgs[]){
		 TestInterrupingThread thread1 = new TestInterrupingThread();
		 thread1.start();
		 thread1.interrupt();
	}
}
