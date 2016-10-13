import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExMain {

	public static void main(String[] args){
		
		//Locks for CrossLock
		Object Lock1 = new Object();
	    Object Lock2 = new Object();
		
	    //Array for RaceCondition
		int[] array1 = new int[100];
		Arrays.fill(array1, 0);
		//Individual thread creation
		Thread t1 = new Thread(new DescriberRunnable("first thread"));
		Thread t2 = new Thread(new DescriberRunnable("second thread"));
		Thread t3 = new Thread(new DescriberRunnable("third thread"));
		Thread t5 = new Thread(new DescriberRunnable("second executor thread"));
		Thread RaceConditionThread = new Thread(new RaceCondition(array1));
		Thread RaceConditionThread2 = new Thread(new RaceCondition2(array1));
		Thread CrossLockThread = new Thread(new CrossLockThread(Lock1, Lock2));
		Thread CrossLockThread2 = new Thread(new CrossLockThread2(Lock1, Lock2));
		//Nasty path, null to thread, call start
		//Thread t4 = new Thread();
		
		//Happy Path
		//Executor creation and run/submit action
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		//First executor example
		executor.submit(() -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("\nThread name is " + threadName);
		});
		
		//Nasty Path
		//Race Condition
		RaceConditionThread.start();
		RaceConditionThread2.start();
		//Cross Lock
		CrossLockThread.start();
		CrossLockThread2.start();
		
		
		//Happy Path
		//Second executor example
		ExecutorTask executortest = new ExecutorTask();
		executortest.execute(t5);
		
		//Run Threads
		t1.start();
		t2.start();
		t3.start();
		//t4.start();
		
		//Nasty Path - Failed thread, already started
		//t3.start();
		
		//Null to executor
		//executortest.execute(null);
	}

//	private static void RaceCondition() {
//	}
}


