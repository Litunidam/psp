package ejercicioCajerasModificado;

import ejercicioCajeras.Producto;

public class MainThread {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Cliente 1", new Producto[] { new Producto(2), new Producto(2), new Producto(1), new Producto(5), new Producto(2), new Producto(3) });
		Cliente cliente2 = new Cliente("Cliente 2", new Producto[] { new Producto(1), new Producto(3), new Producto(5), new Producto(1), new Producto(1) });

		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		CajeraThread cajera1 = new CajeraThread("Cajera 1", cliente1, initialTime);
		initialTime = System.currentTimeMillis();
		CajeraThread cajera2 = new CajeraThread("Cajera 2", cliente2, initialTime);

		cajera1.start();
		cajera2.start();
	}
} 