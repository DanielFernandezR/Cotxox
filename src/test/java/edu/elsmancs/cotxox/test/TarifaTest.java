package edu.elsmancs.cotxox.test;

import static org.junit.Assert.*;

import edu.elsmancs.cotxox.carrera.Carrera;
import edu.elsmancs.cotxox.tarifa.*;

import org.junit.Test;

public class TarifaTest {

	Carrera pruebaCarrera = new Carrera("4521896532147852");
	private static final double costeMilla = 1.35;
	private static final double costeMinuto = 0.35;
	private static final double costeMinimo = 5.0;
	private static final int porcentajeComision = 20;
	
	@Test
	public void getCosteDistanciaTest() {
		double distancia = 20.3;
		double delta = 0.01;
		assertEquals(distancia * costeMilla, Tarifa.getCosteDistancia(distancia), delta);
	}

	@Test
	public void getCosteTiempoTest() {
		int tiempo = 20;
		double delta = 0.01;
		assertEquals(tiempo * costeMinuto, Tarifa.getCosteTiempo(tiempo), delta);
	}
	
	@Test
	public void getCosteTotalEsperadoTest() {
		pruebaCarrera.setDistancia(20.3);
		pruebaCarrera.setTiempoEsperado(20);
		double delta = 0.01;
		assertEquals(pruebaCarrera.getDistancia() * costeMilla + pruebaCarrera.getTiempoEsperado() * costeMinuto, pruebaCarrera.getCosteEsperado(), delta);
	}
}
