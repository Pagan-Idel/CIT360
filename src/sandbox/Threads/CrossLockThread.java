
public class CrossLockThread extends Thread {
	
	Object Lock1;
	Object Lock2;
	
	public CrossLockThread (Object a, Object b) {
		Lock1 = a;
		Lock2 = b;
	}
	
	public void run() {
        synchronized (Lock1) {
            System.out.println("I am taking the Screwdriver");
            try { 
            	Thread.sleep(2000); 
            	}
            catch (InterruptedException e) {
            	System.out.println("Something Failed");
            }
            System.out.println("Waiting for the Hammer so I have both");
            synchronized (Lock2) {
                System.out.println("I have both so I can finish");
            }
        }
    }	
}


class CrossLockThread2 extends Thread{
	
	Object Lock2;
	Object Lock1;
	
	public CrossLockThread2(Object a, Object b) {
		Lock1 = a;
		Lock2 = b;
	}
	
	public void run() {
        synchronized (Lock2) {
            System.out.println("I am taking the Hammer");
            try { 
            	Thread.sleep(2000); 
            }
            catch (InterruptedException e) {
            	System.out.println("Something Failed");
            }
            System.out.println("Waiting for the Screwdriver so I have both");
            synchronized (Lock1) {
                System.out.println("I have both so I can finish");
            }
        }
    }	
}