package ar.edu.unq.po2.tp5.mercadocentral;

public class Producto implements Facturable {
	
	private String nombre;
	protected double precio;
	private int stock;
	
	public Producto(String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void decrementarStock() {
		int nuevoStock = this.getStock()-1 ;
		this.setStock(nuevoStock);
	}
	
	@Override
	public double montoAPagar() {
		this.decrementarStock();
		return this.getPrecio();	
	}

	@Override
	public void procesarRegistro() {
		this.decrementarStock();
	}
}
