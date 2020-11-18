package introduccionHilos;

public class HilosNumerosLetras extends Thread {

	
	
	public HilosNumerosLetras (String str) {
		super(str);
		
	}
	
	@Override
	public void run() {

		switch (Integer.parseInt(getName())) {
		case 1:

			for (int i = 1; i < 31; i++) {

				System.out.println(i);

			}

			break;
		case 2:
			String abc = "abcdefghijklmnñopqrstuvwxyz";

			for (int i = 0; i < abc.length(); i++) {

				System.out.println(abc.charAt(i));
			}

			break;
		}

	}
	
	public static void main(String[] args) {
		new HilosNumerosLetras("1").start();
		new HilosNumerosLetras("2").start();
	}
	
	
	
}
