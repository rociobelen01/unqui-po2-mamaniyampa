package ar.edu.unq.po2.tp5.mercadocentral;

import java.util.ArrayList;
import java.util.List;

public class CajaRegistradora {
	 
	private int id;
	private List<Facturable> facturables;
	
	public CajaRegistradora(int id) {
		this.id = id;
		this.facturables = new ArrayList<Facturable>();
	}
	
	public void registrarItem(Facturable f) {
		this.facturables.add(f);
		f.procesarRegistro(); 
	}
	
	public double montoAPagar() {
		double total = 0;
		for(Facturable p:facturables) {
			total += p.montoAPagar();
		}
		return total;
	}
}
