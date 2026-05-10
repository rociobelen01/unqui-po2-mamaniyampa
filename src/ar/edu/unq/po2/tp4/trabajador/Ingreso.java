package ar.edu.unq.po2.tp4.trabajador;

public class Ingreso {
	
	private String mes;
	private String concepto;
	private double monto;
	
	public Ingreso(String mes, String concepto, double monto) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}
	
	public double montoPercibido() {
		return monto;
	}
	
	public double montoImponible() {
		return monto;
	}
	
	public String getConcepto() {
		return concepto;
	}
	
	public String getMes() {
		return mes;
	}
}
