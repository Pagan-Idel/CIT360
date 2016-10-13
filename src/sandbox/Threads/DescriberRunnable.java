import java.util.*;
import java.util.concurrent.*;

//Sandbox code for threads, creation of thread class

public class DescriberRunnable implements Runnable {
	//Declare variables, name of thread and random time for thread to sleep.
	String name;
	int time;
	Random r = new Random();
	
	public DescriberRunnable(String a){
		name = a;
		time = r.nextInt(999);
	}
	
	//Happy Path
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
			//Nasty path - negative value for sleep, executes on all thread calls
			Thread.sleep(-100);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
