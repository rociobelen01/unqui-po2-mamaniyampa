package ar.edu.unq.po2.tp6.bancoyprestamos;

public class CreditoHipotecario extends SolicitudCredito {
	
	private Propiedad propiedad;
	
	public CreditoHipotecario(String nombre, double monto, int meses, Cliente cliente, Propiedad propiedad) {
		super(nombre, monto, meses, cliente);
		this.propiedad = propiedad;
	}
	
	public Propiedad getPropiedad() {
		return propiedad;
	}
	
	@Override
	public boolean esAceptable() {
		boolean montoAceptable = this.montoCuotaMensual() < this.getCliente().getSueldoNetoMensual() *0.5;
		boolean montoSolicitadoAceptable = this.getMonto() <= this.getPropiedad().getValorFiscal() * 0.7;
		int añosDeCredito = this.getPlazoEnMeses() / 12;
		int edadFinalizar = this.getCliente().getEdad() + añosDeCredito;
		boolean edadAdecuada = edadFinalizar < 65;
		return (montoAceptable && montoSolicitadoAceptable && edadAdecuada); 
	}

}
