package ar.edu.unq.po2.tp4.trabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	public Trabajador(List<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}
	
	public double getTotalPercibido() {
		double contador = 0;
		for(Ingreso i:ingresos) {
			contador = contador + i.montoPercibido();
		}
		return contador;
	}
	//retornar el monto total percibido por el trabajador

	public double getMontoImponible() {
		double contador = 0;
		for(Ingreso i:ingresos) {
			contador = contador + i.montoImponible();
		}
		return contador;
	}
	//retornar el monto imponible al impuesto al trabajador
	
	
	public double getImpuestoAPagar() {
		return getMontoImponible()*0.02;
	}
	//retornar el monto a pagar por el trabajador, calculado como el 2% del monto imponible

}
