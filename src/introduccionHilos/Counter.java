package introduccionHilos;

public class Counter extends Thread{

	static int counter = 0;
	
	public Counter() {
		
	}
	
	@Override
	public void run() {
		
		count();
		System.out.println(counter);
	}
	
	public static synchronized void count() {
		
		for(int i=0;i<5000;i++) {
			
			counter++;
		
		}
		
	}
	
	public static void main(String[] args) {
		
		new Counter().start();
		new Counter().start();
		new Counter().start();
		new Counter().start();
		
	}
}
