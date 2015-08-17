package Annonymous;

public class Table {
	synchronized void print(int n){
		for(int i =0 ; i<5 ; i++){
			System.out.println(i*n);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println("Exception "+e);
			}
		}
	}
}
