package ar.edu.unq.po2.tp6.bancoyprestamos;

	abstract public class SolicitudCredito  {
	
	private String nombre;
	private double monto;
	private int meses;
	private Cliente cliente;
	
	public SolicitudCredito(String nombre, double monto, int meses, Cliente cliente) {
		this.nombre = nombre;
		this.monto = monto;
		this.meses = meses;
		this.cliente = cliente;
	}
	
	
	public double getMonto() {
		return monto;
	}
	
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	public int getPlazoEnMeses() {
		return meses;
	}
	
	public void setPlazoEnMeses(int meses) {
		this.meses = meses;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public double montoCuotaMensual() {
		return this.getMonto() / meses;
	}
	
	public abstract boolean esAceptable();
	
	
}
