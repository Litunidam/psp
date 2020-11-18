package introduccionHilos;

public class Ejercicio1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i<10;i++) {
			System.out.println(Thread.currentThread().getName()+": "+(i+1));
		}
	}
	
	public static void main(String[]args) {		
		new Thread(new Ejercicio1(),"Hilo 1 Hola mundo").start();
		new Thread(new Ejercicio1(),"Hilo 2 Hola mundo").start();
	}
}