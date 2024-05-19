package org.cuatrovientos.dam3.ed.EntornosTestJAVA;

public interface Transporte {
	/**
	 * Interfaz con 3 métodos
	 */

	public void incluirPaquete(Paquete paquete);

	public float pesoTotal();

	public int recorrerDistancia();
}
