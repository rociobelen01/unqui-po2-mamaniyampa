package ar.edu.unq.po2.tp6.bancoyprestamos;

public class CreditoPersonal extends  SolicitudCredito {

	public CreditoPersonal(String nombre, double monto, int meses, Cliente cliente) {
		super(nombre, monto, meses, cliente);
	}
	
	@Override
	public boolean esAceptable() {
		boolean tieneIngresosSuficientes = getCliente().sueldoNetoAnual() >= 15000 ;
		double limiteSueldo = this.getCliente().getSueldoNetoMensual() * 0.7;
		boolean montoAceptable = this.montoCuotaMensual() < limiteSueldo ;
		return tieneIngresosSuficientes && montoAceptable ;
	
	}
}
