import java.util.concurrent.*;

class threadtask implements Executor {
     public void execute(Runnable r) {
         new Thread(r).start();
     }
 }