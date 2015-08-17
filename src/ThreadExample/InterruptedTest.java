package ThreadExample;

public class InterruptedTest extends Thread{
	public void run(){
		for(int i = 1 ; i <= 2; i++){
			if(Thread.interrupted()){
				//Thread.yield();
				System.out.println("Code for interrupted"+Thread.currentThread().getName());
			}
			else{
					System.out.println("Code for normal thread");
				}
			
		}
		
	}
	public static void main(String avgs[]){
		InterruptedTest t1 = new InterruptedTest();
		InterruptedTest t2 = new InterruptedTest();
		t1.start();
		t1.interrupt();
		
		t2.start();
		t2.interrupt();
	}
}
