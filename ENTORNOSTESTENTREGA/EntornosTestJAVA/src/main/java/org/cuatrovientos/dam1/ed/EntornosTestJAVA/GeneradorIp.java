package org.cuatrovientos.dam1.ed.EntornosTestJAVA;
import java.util.*;
public class GeneradorIp {
	/**
	 * Declarar variables minimo,maximo y random
	 */
	private Integer minimo;
	private Integer maximo;
	private Random rnd;

	/**
	 * Número aleatorio entre 70 y 100
	 */

	public GeneradorIp() {
		/**
		 * Declarar el random como nuevo
		 */
		rnd = new Random();
	}

	public int generarNumero(int min, int max) {
		/**
		 * Iguala las variables de generador IP a los 2 parametros de la funcion
		 * Generaa un número random que entre los 2 parametros
		 */
		this.minimo=min;
		this.maximo=max;
		return  rnd.nextInt((max-min)+1)+min;
	}

	public String generarIp() {
		/**
		 * Por cada octeto se llama a la funcion generarNumero que te devolvera el valor del octeto correspondiente
		 */
		generarNumero(0,255);
		return generarNumero(this.minimo,this.maximo)+"."+generarNumero(this.minimo,this.maximo)+"."+generarNumero(this.minimo,this.maximo)+"."+generarNumero(this.minimo,this.maximo);
	}
}
