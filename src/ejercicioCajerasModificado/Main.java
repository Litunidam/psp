package ejercicioCajerasModificado;

import ejercicioCajeras.Producto;

public class Main {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Cliente 1", new Producto[] { new Producto(2), new Producto(2), new Producto(1), new Producto(5), new Producto(2), new Producto(3) });
		Cliente cliente2 = new Cliente("Cliente 2", new Producto[] { new Producto(1), new Producto(3), new Producto(5), new Producto(1), new Producto(1) });

		Cajera cajera1 = new Cajera("Cajera 1");
		Cajera cajera2 = new Cajera("Cajera 2");

		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();

		cajera1.procesarCompra(cliente1, initialTime);
		
		initialTime = System.currentTimeMillis();
		
		cajera2.procesarCompra(cliente2, initialTime);
	}
}
