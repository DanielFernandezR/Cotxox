/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.elsmancs.cotxox.test;

import org.junit.Test;

import edu.elsmancs.cotxox.carrera.Carrera;

import static org.junit.Assert.*;

import org.junit.Before;

public class CarreraTest {

	Carrera prueba;
	
	@Before
	public void setupTest() {
		String[] tarjetasVisa = {"6214785236985214", 
				  				"7983214657419635", 
				  				"4825163897420054"};
		
		for(String tarjeta:tarjetasVisa) {
			prueba = new Carrera(tarjeta);
			assertEquals(tarjeta,prueba.getTarjetaCredito());
		}
	}

	@Test
	public void setOrigenTest() {
		String origen = "Mi casa";
		prueba.setOrigen(origen);
		assertEquals(origen, prueba.getOrigen());
	}
	
	@Test
	public void setDestinoTest() {
		String destino = "El instituto";
		prueba.setDestino(destino);
		assertEquals(destino, prueba.getDestino());
	}
	
	@Test
	public void setDistanciaTest() {
		double distancia = 10.1;
		double delta = 0.01;
		prueba.setDistancia(distancia);
		assertEquals(distancia, prueba.getDistancia(), delta);
	}
	
	@Test
	public void setTiempoEsperadoTest() {
		int tiempo = 40;
		prueba.setTiempoEsperado(tiempo);
		assertEquals(tiempo, prueba.getTiempoEsperado());
	}
	
	@Test
	public void getCosteEsperadoTest() {
		double distancia = 20.2;
		int tiempoEsperado = 10;
		double delta = 0.01;
		prueba.setDistancia(distancia);
		prueba.setTiempoEsperado(tiempoEsperado);
		assertEquals(distancia * 1.35 + tiempoEsperado * 0.35, prueba.getCosteEsperado(), delta);
	}
}
