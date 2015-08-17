package StaticSynchronization;

public class Table {
	synchronized static void print(int n){
		for(int i=1 ; i<=10; i++){
			System.out.println(i*n);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println("Exception "+e);
			}
		}
	}
}	
