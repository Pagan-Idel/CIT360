import java.util.*;

public class threads1 implements Runnable {
	String name;
	int time;
	Random r = new Random();
	
	public threads1(String a){
		name = a;
		time = r.nextInt(999);
	}
	
	public void run(){
		try{
			System.out.printf("%s sleeping for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
		}
		catch(Exception e) {
			
		}
	}
}
