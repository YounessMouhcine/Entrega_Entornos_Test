package org.cuatrovientos.dam2.ed.EntornosTestJAVA;

import java.util.ArrayList;

public class Factura {
	/**
	 * Crear una lista de productos
	 */
	ArrayList<Producto> milista;

	public Factura() {
		/**
		 * Declarar la lista como una nueva
		 */
		milista = new ArrayList<Producto>();
	}

	public void meterProducto(Producto producto) {
		/**
		 * Meter productos a milista
		 */
		milista.add(producto);
	}

	public Integer factura() {
		/**
		 * Recorrer la milista
		 * Por cada producto, se coge y se suma su precioTotal
		 * Devuelve la suma de todos los precios de los productos
		 */
		Integer suma=0;
		for (Producto producto : milista) {
			suma = (int) (suma + producto.precioTotal());	
		}
		return suma;
	}

	public float aplicarIVA(float IVA) {
		/**
		 *  Recorrer la milista
		 * Por cada producto, se coge y se suma su precioTotal
		 * Devuelve la suma de todos los precios de los productos mas el IVA
		 */
		Integer suma=0;
		for (Producto producto : milista) {
			suma = (int) (suma + producto.precioTotal());	
		}
		return suma - (suma*(IVA/100));
	}

}
