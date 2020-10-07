package primerosEjercicios;


public class Ejercicio3 {

	public static void main(String[] args) {
		
		for (int i=0;i<7;i++) {
			
			for (int j=0;j<7-i;j++) {
				if(i!=2) {
					System.out.print(" ");
				}
								}
			for (int k=0;k<(i*2)-1;k++) {
				if (i!=2) {
					System.out.print("*");
				}
							}
			
			if(i!=2) {
				System.out.println();	
			}
			
		}
		
		
	}
	
	
}
