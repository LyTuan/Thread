package StaticSynchronization;

public class Main {
	public static void main(String avgs[]){
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		Thread4 t4 = new Thread4();
		t4.start();
		t3.start();
		t2.start();
		t1.start();
	}
}
