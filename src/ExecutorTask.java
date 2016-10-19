import java.util.concurrent.*;

class ExecutorTask implements Executor {
     public void execute(Runnable r) {
         new Thread(r).start();
     }
 }