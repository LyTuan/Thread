package RunThreadTest;

public class RunThread extends Thread{
	String name;
	public RunThread(String name){
		this.name = name;
	}
	public void run(){
		for(int pos = 0; pos< 10 ;pos++){
		try{
			Thread.sleep(500);
			
				System.out.println(name+" "+pos);
			
		}catch(InterruptedException e){
			
		}
		}
		
	
	}
}
