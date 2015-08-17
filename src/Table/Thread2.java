package Table;

public class Thread2 extends Thread{
	Table t2;
	public Thread2 (Table t2){
		this.t2 = t2;
	}
	public void run(){
		t2.printTable(100);
	}
}
