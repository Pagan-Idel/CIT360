import java.util.*;
import java.util.concurrent.*;

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
	
	//Main thread creation
	public static void main(String[] args){
		//Individual thread creation
		Thread t1 = new Thread(new threads1("first thread"));
		Thread t2 = new Thread(new threads1("second thread"));
		Thread t3 = new Thread(new threads1("third thread"));
		Thread t4 = new Thread(new threads1("executor thread"));
		Thread t5 = new Thread(new threads1("second executor thread"));
		
		//Happy Path
		//Executor creation and run/submit action
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		//First executor example
		executor.submit(() -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("\nThread name is " + threadName);
		});
		
		executor.submit(t5);
		
		//First executor example
		threadtask executortest = new threadtask();
		executortest.execute(t4);

	//Run Threads
		t1.start();
		t2.start();
		t3.start();
		
	//Nasty Path - Failed thread, already started
		t3.start();
	}
}
