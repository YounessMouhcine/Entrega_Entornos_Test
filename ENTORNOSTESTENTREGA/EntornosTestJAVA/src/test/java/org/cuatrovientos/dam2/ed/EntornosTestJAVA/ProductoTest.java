package org.cuatrovientos.dam2.ed.EntornosTestJAVA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	/**
	 * Crear objeto producto
	 */
	Producto producto;
	@BeforeEach
	void setUp() throws Exception {
		/**
		 * Declarar el producto como uno nuevo con atributos
		 */
		producto = new Producto("Pescado",31.6f,12);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPrecioTotal() {
		/**
		 * Llamar al método precioTotal e igualarlo con el resultado
		 */
		float expected = producto.precioTotal();
		float resultado = 379.2f;
		assertEquals(expected,resultado,"El metodo precioTotal no funciona");

	}

}
