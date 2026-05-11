package ar.edu.unq.po2.tp5.mercadocentral;

public class Impuesto implements Facturable {
	private double tasa;
	private Agencia agencia; 
	
	public Impuesto(double tasa, Agencia agencia) {
		this.tasa = tasa;
		this.agencia = agencia;
	}
	
	@Override
	public double montoAPagar() {
		return tasa;
	}

	@Override
	public void procesarRegistro() {
		agencia.registrarPago(this);
		
	}
}
