package ar.edu.unq.po2.tp6.bancoyprestamos;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Cliente> clientes;
	private List<SolicitudCredito> solicitudes;
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudCredito>();
	}
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void registrarSolicitud(SolicitudCredito solicitud) {
		this.solicitudes.add(solicitud);
	}
	
	public double montoADesembolsar() {
		double montoFinal = 0;
		for(SolicitudCredito solicitud:solicitudes) {
			if (solicitud.esAceptable()) {
				montoFinal += solicitud.getMonto();
			}
		}
		return montoFinal;
	}
	
}
