package org.cuatrovientos.dam3.ed.EntornosTestJAVA;

import java.util.ArrayList;
import java.util.Random;

public class Camioneta implements Transporte {
	/**
	 * Crear un objeto tipo Random
	 * Crear una lista de paquetes
	 */
	Random rnd;
	ArrayList<Paquete> listaPaquetesC;

	public Camioneta() {
		/**
		 * Declararlos como nuevos
		 */
		rnd = new Random();
		listaPaquetesC = new ArrayList<Paquete>();
	}

	public void incluirPaquete(Paquete paquete) {
		/**
		 * Mete un paquete en la lista
		 */
		listaPaquetesC.add(paquete);
	}

	public float pesoTotal() {
		/**
		 * Por cada paquete en la lista se le suma su peso
		 */
		float suma=0;
		for (Paquete paquete:listaPaquetesC) {
			suma = suma + paquete.getPeso();
		}
		return suma;
	}

	public int recorrerDistancia() {
		/**
		 * Número aleatorio entre 70 y 100
		 */
		return rnd.nextInt((100-70)+1)+70;
	}

}
