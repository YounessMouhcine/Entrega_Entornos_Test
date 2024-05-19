package org.cuatrovientos.dam2.ed.EntornosTestJAVA;

public class Producto {
	/**
	 * Declarar variables nombre,precio y cantidad como protected
	 */
	protected String nombre;
	protected float precio; 
	protected int cantidad;

	public Producto(String nombre, float precio, int cantidad) {
		/**
		 * Constructor para un nuevo producto
		 */
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public float precioTotal() {
		/**
		 * Conseguir precio a partir de multiplicar precio por su cantidad
		 */
		return precio*cantidad;
	}
	@Override
	public String toString() {
		/**
		 * To string que devuelve los valores de producto
		 */
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
}
