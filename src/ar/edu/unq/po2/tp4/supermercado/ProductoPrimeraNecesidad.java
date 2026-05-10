package ar.edu.unq.po2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	
	private double descuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio);
		this.descuento = descuento;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento= descuento;
	}

	@Override
	public double getPrecio() {
		double precio = this.precio;
		double descuento = getDescuento();
		return precio*(1- descuento);
	}
	public double getDescuento() {
		return descuento;
	}
}
