package introduccionHilos;

public class Ejercicio2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<2;i++) {
			System.out.println("Hilo "+Thread.currentThread().getName());
		}
		System.out.println("Fin");
	}
	
	public static void main(String[] args) {
		new Thread(new Ejercicio2(),"1").start();
		new Thread(new Ejercicio2(),"2").start();
		new Thread(new Ejercicio2(),"3").start();
	}
	
}