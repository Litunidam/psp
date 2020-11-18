package introduccionHilos;

import java.io.IOException;

public class Ejercicio6 {

		public static void main(String[] args) {
			
			try {
				
				new Writer("ejercicio6.txt").start();
				
				new Reader("ejercicio6.txt").start();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
		}
	
}
