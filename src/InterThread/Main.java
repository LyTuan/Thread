package InterThread;

public class Main {
	public static void main(String avgs[]){
		Customer c1 = new Customer();
		 new Thread(){
		public void run(){
			c1.withDraw(15000);
		}
		}.start();
		new Thread(){
			public void run(){
				c1.deposite(10000);
			}
		}.start();
	}
}
