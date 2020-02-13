package edu.elsmancs.cotxox.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.elsmancs.cotxox.conductor.Conductor;

public class ConductorTest {
	
	Conductor prueba;
	
	@Before
	public void setup() {
		prueba = new Conductor("Manuel");
		assertEquals("Manuel", prueba.getNombre());
	}
	
	@Test
	public void getModeloTest() {
		String modelo = "Mazda";
		prueba.setModelo(modelo);
		assertEquals("Mazda", prueba.getModelo());
	}

	@Test
	public void getMatriculaTest() {
		String matricula = "4532 FWN";
		prueba.setMatricula(matricula);
		assertEquals("4532 FWN", prueba.getMatricula());
	}
	
	@Test
	public void getValoracionYCalcularValoracionMediaTest() {
		byte[] valoraciones = {4,5,3};
		double delta = 0.001;
		for(byte valoracion:valoraciones) {
			prueba.setValoracion(valoracion);
		}
		assertEquals(4, prueba.getValoracion(), delta);
	}
	
	@Test
	public void getNumValoracionesTest() {
		byte[] valoraciones = {4,5,3,2,5,8};
		for(byte valoracion:valoraciones) {
			prueba.setValoracion(valoracion);
		}
		assertEquals(6, prueba.getNumValoraciones());
	}
	
	@Test
	public void isOcupadoTest() {
		boolean ocupado = false;
		prueba.setOcupado(ocupado);
		assertEquals(false, prueba.isOcupado());
	}
}
