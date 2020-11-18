package ejercicioCajerasModificado;

import ejercicioCajeras.Producto;

public class Cliente {

	private String nombre;
	private Producto[] carroCompra;
	
	public Cliente(String nombre, Producto[] carroCompra) {
		this.nombre = nombre;
		this.carroCompra = carroCompra;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Producto[] getCarroCompra() {
		return carroCompra;
	}
	public void setCarroCompra(Producto[] carroCompra) {
		this.carroCompra = carroCompra;
	}

	// Constructor, getter y setter
	
	

}