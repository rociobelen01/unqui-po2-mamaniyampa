package ar.edu.unq.po2.tp8.composite.cultivo;

import java.util.Arrays;
import java.util.List;

public class PorcionMixta extends PorcionProductiva {
	List<PorcionProductiva> porciones;

	
	public PorcionMixta(PorcionProductiva p1,PorcionProductiva p2,PorcionProductiva p3,PorcionProductiva p4) {
		porciones = Arrays.asList(p1,p2,p3,p4);
	}
	
	@Override
	public double getGanaciaAnualTrigo() { 
		return porciones.stream()
				.mapToDouble(p -> p.getGanaciaAnualTrigo())
				.sum() /4;
		 /*
		 double sumaTotal = 0;
		 for(PorcionProductiva p : porciones) {
		      sumaTotal += p.getGanaciaAnualTrigo();
		 }
		 return sumaTotal / 4;
		 */
	}

	@Override
	public double getGanaciaAnualSoja() {
		return porciones.stream()
				.mapToDouble(p -> p.getGanaciaAnualSoja())
				.sum() /4;
	}
}
