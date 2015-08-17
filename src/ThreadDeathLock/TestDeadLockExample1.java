package ThreadDeathLock;

public class TestDeadLockExample1 {
	public  static void main(String avgs[]) throws InterruptedException{
			String rescore1 = "raitan";
			String rescore2 = "vimal";
			Thread t1 = new Thread(){
			public void run(){
				synchronized (rescore1) {
					System.out.println("Thread1:Lock thread1");
					try{
						Thread.sleep(500);
					}catch(Exception e){
						
					}
					synchronized (rescore2) {
						System.out.println("Thread1:Lock thread2");
					}
				}
				
			}
			};
			Thread t2 = new Thread(){
				public void run(){
					synchronized(rescore2){
						System.out.println("Thread2:Lock thread2");
						try{
							Thread.sleep(500);
						}catch(Exception e){
							
						}
//					
						synchronized(rescore1){
							System.out.println("Thread2:Lock thread1");
						}
					}
					
					
				}
			};
//			Thread t3 = new Thread(){
//				public void run(){
//					synchronized (rescore1) {
//						System.out.println("Thread3:Lock Thread3");
//						try{
//							Thread.sleep(500);
//						}catch(Exception e){
//							
//						}
//					}
//				}
//			};
//			t3.start();
			//t3.wait();
			t1.start();
		//	t1.join();
			//t1.suspend();
			t2.start();
			//t2.wait(50);
			//t3.resume();
			
			
		
	}
}
