package ar.edu.unq.po2.tp4.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public void agregarProducto(Producto p) {
		productos.add(p);
	}
	
	public double getPrecioTotal() {
		double contador = 0;
		for(Producto p:productos) {
			contador = contador + p.getPrecio();
		}
		return contador;
	}
}
