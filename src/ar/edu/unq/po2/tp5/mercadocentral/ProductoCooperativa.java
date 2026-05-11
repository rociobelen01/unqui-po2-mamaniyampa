package ar.edu.unq.po2.tp5.mercadocentral;

public class ProductoCooperativa extends Producto {
	
	public ProductoCooperativa(String nombre, double precio, int stock) {
		super(nombre, precio, stock);
	}
	
	@Override
	public double getPrecio() {
		return this.precio * 0.9;
		// el 10% de descuento: el precio es el 90% del original
	}
	
	
}
