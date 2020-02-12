package edu.elsmancs.cotxox.tarifa;

import edu.elsmancs.cotxox.carrera.Carrera;

public class Tarifa {
	
	private static final double costeMilla = 1.35;
	private static final double costeMinuto = 0.35;
	private static final double costeMinimo = 5.0;
	private static final int porcentajeComision = 20;
	
	public static double getCosteDistancia(double distancia) {
		return costeMilla * distancia;
	}
	
	public static double getCosteTiempo(double minutos) {
		return costeMinuto * minutos;
	}
	
	public static double getCosteTotalEsperado(Carrera carrera) {
		Double costeTotal = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
		if (costeTotal > costeMinimo) {
			return costeTotal;
		}else {
			return 0.0;
		}
	}
}