package ar.edu.unq.po2.tp4.supermercado;

public class Producto {

	protected String nombre;
	protected double precio;
	protected boolean esPrecioCuidado;
	
	public Producto(String nombre, double precio) {
		 this.nombre = nombre;
		 this.precio = precio;
		 this.esPrecioCuidado = false;
	}
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this(nombre,precio);
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	public void aumentarPrecio(double n) {
		double precioNuevo = getPrecio() + n;
		this.setPrecio(precioNuevo);
	}
	
}
