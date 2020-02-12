package edu.elsmancs.cotxox.conductor;

import java.util.ArrayList;

public class Conductor {
	
	private String nombre = null;
	private String modelo = null;
	private String matricula = null;
	private double valoracionMedia = 0.d;
	private ArrayList<Double> valoraciones = new ArrayList<>();
	private boolean ocupado = false;
	
	public Conductor(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getValoracionMedia() {
		return valoracionMedia;
	}

	public void setValoracionMedia(double valoracionMedia) {
		this.valoracionMedia = valoracionMedia;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
}
