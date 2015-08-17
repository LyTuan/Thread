package Table;

public class Thread1 extends Thread {
	Table t1;
	public Thread1(Table t1){
		this.t1 = t1;
	}
	public void run(){
		t1.printTable(5);
	}
}
