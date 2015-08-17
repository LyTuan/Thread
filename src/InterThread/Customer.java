package InterThread;

public class Customer {
	 int amount = 10000;
	synchronized void withDraw(int amount){
		System.out.println("going to with draw...");
		if(this.amount<amount){
			System.out.println("Less balance, waiting  for deposite");
			try{
				wait();
			}catch(Exception e){
				
			}
			
		}
		this.amount-=amount;
		System.out.println("withdraw is complete");
	}
	synchronized void deposite(int amount){
		System.out.println("Going to deposite!");
		this.amount+=amount;
		System.out.println("Deposite complete.");
		notify();
	}
}
