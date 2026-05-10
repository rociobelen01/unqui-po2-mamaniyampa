package ar.edu.unq.po2.tp4.trabajador;

public class IngresoHorasExtras extends Ingreso {
	
	private int cantHorasExtras;
	
	public IngresoHorasExtras(String mes, String concepto, double monto, int cantHorasExtras) {
		super(mes,concepto,monto);
		this.cantHorasExtras = cantHorasExtras;
	}
	
	@Override
	public double montoImponible() {
		return 0;
	}
	
}
