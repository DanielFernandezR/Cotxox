package edu.elsmancs.cotxox.conductor;

import java.util.ArrayList;
import java.util.Random;

public class PoolConductores {

	private ArrayList<Conductor> poolConductores = new ArrayList<>();
	
	public PoolConductores(ArrayList<Conductor> poolConductores) {
		this.poolConductores = poolConductores;
	}

	public ArrayList<Conductor> getPoolConductores(){
		return this.poolConductores;
	}
	
	public Conductor asignarConductor() {
		boolean conductoraAsignada = false;
		Random aleatoria = new Random();
		Conductor conductora = new Conductor();
		
		while(conductoraAsignada == false) {
			int index = aleatoria.nextInt(getPoolConductores().size());
			conductora = getPoolConductores().get(index);
			if(conductora.isOcupado() == false) {
				conductora.setOcupado(true);
				conductoraAsignada = true;
			}
		}
		return conductora;
	}
}