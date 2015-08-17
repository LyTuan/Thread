package Annonymous;

public class Main {
	public static void main(String avgs[]){
	final Table obj = new Table();
	Thread t1 = new Thread(){
		public void run(){
			obj.print(5);
		}
	};
	Thread t2 = new Thread(){
		public void run(){
			obj.print(100);
		}
	};
	
	t1.start();
	t2.start();
	}
	
}
