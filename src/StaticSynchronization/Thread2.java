package StaticSynchronization;

public class Thread2 extends Thread{
	Table t1 = new Table();
	public void run(){
		Table.print(10);
	}
			
}
