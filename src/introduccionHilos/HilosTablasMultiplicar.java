package introduccionHilos;

public class HilosTablasMultiplicar extends Thread{

	public HilosTablasMultiplicar(String str){
		super(str);
	}
	
	@Override
	public void run() {
		System.out.println("La tabla del: "+getName());
		for (int i=0;i<11;i++) {
			System.out.println(getName()+" x "+i+" = "+Integer.parseInt(getName())*i);
		}
	}


	public static void main(String[] args) {
	
		new HilosTablasMultiplicar("1").start();
		
	}
}