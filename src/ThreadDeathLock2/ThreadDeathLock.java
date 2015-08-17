package ThreadDeathLock2;

public class ThreadDeathLock {
	
	    static class Friend {
	        private final String name;
	        public Friend(String name) {
	            this.name = name;
	        }
	        public String getName() {
	            return this.name;
	        }
	        public synchronized void bow(Friend bower) {
	            System.out.format("%s: %s"
	                + "  has bowed to me!%n", 
	                this.name, bower.getName());
//	           bower.bowBack(this);
	            try{
	            	Thread.sleep(500);
	            }catch(Exception e){
	            	System.out.println(e);
	            }
	            
	        }
	        public synchronized void bowBack(Friend bower) {
	            System.out.format("%s: %s"
	                + " has bowed back to me!%n",
	                this.name, bower.getName());
	        }
	    }

	    public static void main(String[] args) {
	        final Friend alphonse =
	            new Friend("Alphonse");
	        final Friend gaston =
	            new Friend("Gaston");
	        new Thread(new Runnable() {
	            public void run() { alphonse.bow(gaston); }
	        }).start();
//	        new Thread(new Runnable() {
//	            public void run() { gaston.bow(alphonse); }
//	        }).start();
	    }
	
}
