import java.util.Arrays;




public class RaceCondition implements Runnable {
	
	int[] array1;
	
	public RaceCondition(int[] a) {
		array1 = a;
	}
	public void run(){
		try{
			Arrays.fill(array1, 4);
			
			System.out.println(Arrays.toString(array1));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

class RaceCondition2 implements Runnable {
	
	int[] array1;
	
	public RaceCondition2(int[] a) {
		array1 = a;
	}
	public void run(){
		try{
			
			Arrays.fill(array1, 5);
			
			System.out.println(Arrays.toString(array1));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}