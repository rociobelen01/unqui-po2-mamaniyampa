package ar.edu.unq.po2.tp8.composite.cultivo;

public class Trigo extends PorcionProductiva {
	
	@Override
	public double getGanaciaAnualTrigo() {
		return 300;
	}

	@Override
	public double getGanaciaAnualSoja() {
		return 0;
	}

}
