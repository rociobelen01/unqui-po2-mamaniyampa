package ar.edu.unq.po2.tp5.mercadocentral;

public class AgenciaRecaudadora implements Agencia {
	private int cantRegistros;
	
	public AgenciaRecaudadora() {
		this.cantRegistros = 0 ;
	}

	public int getCantRegistros() {
		return cantRegistros;
	}

	public void setCantRegistros(int cantRegistros) {
		this.cantRegistros = cantRegistros;
	}
	
	@Override
	public void registrarPago(Facturable facturable) {
		int actualizar = this.getCantRegistros() + 1;
		this.setCantRegistros(actualizar);
	}
}
