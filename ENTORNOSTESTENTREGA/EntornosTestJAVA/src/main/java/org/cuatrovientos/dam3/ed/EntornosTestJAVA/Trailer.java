package org.cuatrovientos.dam3.ed.EntornosTestJAVA;

import java.util.Random;
import java.util.Vector;

public class Trailer implements Transporte{
	/**
	 * Crear un objeto tipo Random
	 * Crear un vector de paquetes
	 */
	Random rnd;
	Vector<Paquete> listaPaquetes;

	public Trailer() {
		/**
		 * Declararlos como nuevos
		 */
		rnd = new Random();
		listaPaquetes = new Vector<Paquete>();
	}

	public void incluirPaquete(Paquete paquete) {
		/**
		 * Mete un paquete en el vector
		 */
		listaPaquetes.add(paquete);
	}

	public float pesoTotal() {
		/**
		 * Por cada paquete en la lista se le suma su peso
		 */
		float suma=0;
		for (Paquete paquete:listaPaquetes) {
			suma = suma + paquete.getPeso();
		}
		return suma;
	}

	public int recorrerDistancia() {
		/**
		 * Número aleatorio entre 270 y 300
		 */
		return rnd.nextInt((300-270)+1)+270;
	}



}
