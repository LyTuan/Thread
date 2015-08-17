package TestInterupingThread2;

public class TestInterupingThread2 extends Thread{
	public void run(){
		
		try{
			
			System.out.println("Task");
			Thread.sleep(1000);
		}catch(InterruptedException e){
			throw  new RuntimeException("Thread interrupted"+e);
		}
		System.out.println("Thread runing...");
	}
	public static void main(String avgs[]){
		TestInterupingThread2 t = new TestInterupingThread2();
		t.start();
		try{
		t.interrupt();
		}catch(Exception e){
			System.out.println("Exception handled"+e);
		}
	}
}
