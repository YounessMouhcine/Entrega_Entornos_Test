package org.cuatrovientos.dam3.ed.EntornosTestJAVA;

public class Paquete {
	/**
	 * Declarar variables string destino y float peso
	 */
	private String destino;
	private float peso;

	/**
	 * Constructor para poder crearlos con sus atributos
	 */

	public Paquete(String destino, float peso) {
		this.destino = destino;
		this.peso = peso;
	}

	/**
	 * Getters y Setters de cada atributo
	 */
	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	/**
	 * Funcion ToString que devuelve los atributos de paquete
	 */
	public String toString() {
		return "Paquete [destino=" + destino + ", peso=" + peso + "]";
	}




}
