package edu.elsmancs.cotxox.conductor;

import java.util.ArrayList;

public class PoolConductores {

	private ArrayList<Conductor> poolConductores = new ArrayList<>();
	
	public PoolConductores(ArrayList<Conductor> poolConductores) {
		this.poolConductores = poolConductores;
	}
	
	public void asignarConductor() {
		for (Conductor conductora : poolConductores) {
			if(conductora.isOcupado() == false) {
				conductora.setOcupado(true);
				break;
			}else {}
					
		}
	}
}