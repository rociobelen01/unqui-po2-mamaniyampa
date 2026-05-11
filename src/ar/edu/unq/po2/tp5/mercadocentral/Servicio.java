package ar.edu.unq.po2.tp5.mercadocentral;

public class Servicio implements Facturable {
	
	private double costoPorUnidad;
	private int cantUnidadesConsumidas;
	private String periodoFacturado;
	private Agencia agencia; 
	
	public Servicio(double costoPorUnidad, int cantUnidadesConsumidas, String periodoFacturado, Agencia agencia) {
		this.costoPorUnidad = costoPorUnidad;
		this.cantUnidadesConsumidas = cantUnidadesConsumidas;
		this.periodoFacturado = periodoFacturado;
		this.agencia = agencia;
	}
	
	@Override
	public double montoAPagar() {
		return costoPorUnidad*cantUnidadesConsumidas;
	}

	@Override
	public void procesarRegistro() {
		agencia.registrarPago(this);
		
	}

}
