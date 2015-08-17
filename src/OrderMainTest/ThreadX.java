package OrderMainTest;

public class ThreadX extends Thread{
	
	public ThreadX(String name){
		super(name);
	}
	public void run(){
		System.out.println("Ten luong "+getName());
		for(int pos = 1 ; pos <= 5; pos++){
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				
			}
			System.out.println(pos);
		}
	}
}
