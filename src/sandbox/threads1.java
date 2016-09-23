import java.util.*;

//Sandbox code for threads, creation of thread class

public class threads1 implements Runnable {
	//Declare variables, name of thread and random time for thread to sleep.
	String name;
	int time;
	Random r = new Random();
	
	public threads1(String a){
		name = a;
		time = r.nextInt(999);
	}
	
	//Runnable run method to create thread.
	public void run(){
		try{
			System.out.printf("%s sleeping for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
			//Return some specific thread properties
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().toString());
			System.out.println(Thread.currentThread().isInterrupted());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Main thread creation
	public static void main(String[] args){
		Thread t1 = new Thread(new threads1("first"));
		Thread t2 = new Thread(new threads1("second"));
		Thread t3 = new Thread(new threads1("third"));
		
	//Run Threads
		t1.start();
		t2.start();
		t3.start();
	}
}
