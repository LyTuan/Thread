package Table;

public class Table {
	public void  printTable(int n){
		synchronized (this) {
			for(int i=1; i<=5 ; i++){
				System.out.println(i*n);
				try{
					Thread.sleep(500);
				}catch(Exception e){
					System.out.println("Exception "+e);
				}
			}
			
		}
	
	}
}
