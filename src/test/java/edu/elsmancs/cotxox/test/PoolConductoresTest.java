package edu.elsmancs.cotxox.test;

import java.util.ArrayList;

import org.junit.Test;

import edu.elsmancs.cotxox.carrera.Carrera;
import edu.elsmancs.cotxox.conductor.Conductor;
import edu.elsmancs.cotxox.conductor.PoolConductores;

public class PoolConductoresTest {

	Carrera prueba;
	
	@Test
	public void asignarConductorTest() {
		ArrayList<Conductor> poolConductores = new ArrayList<>();
		String[] nombres = {"PEPE","JOSE"};
		for(String persona: nombres) {
			Conductor conductor = new Conductor(persona);
			poolConductores.add(conductor);
		}
		PoolConductores conductores = new PoolConductores(poolConductores);
		
		for(Conductor conductorEnPool: conductores.getPoolConductores()) {
			System.out.println(conductorEnPool.getNombre());
		}
	}
}
