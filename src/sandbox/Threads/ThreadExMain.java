import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExMain {

	public static void main(String[] args){
		
		//Individual thread creation
		Thread t1 = new Thread(new DescriberRunnable("first thread"));
		Thread t2 = new Thread(new DescriberRunnable("second thread"));
		Thread t3 = new Thread(new DescriberRunnable("third thread"));
		Thread t5 = new Thread(new DescriberRunnable("second executor thread"));
		//Nasty path, null to thread, call start
		Thread t4 = new Thread();
		
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
		RaceCondition();
		//Cross Lock
		
		
		//Happy Path
		//Second executor example
		ExecutorTask executortest = new ExecutorTask();
		executortest.execute(t5);
		
		//Run Threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		//Nasty Path - Failed thread, already started
		t3.start();
		
		//Null to executor
		executortest.execute(null);
	}

	private static void RaceCondition() {
		// TODO Auto-generated method stub
		
	}
}

class RaceCondition implements Runnable {
	public void run() {
		int[] array1 = new int[100];
		Arrays.fill(array1, 0);
		
		System.out.println(array1[1]);
	}
}
