package org.cuatrovientos.dam2.ed.EntornosTestJAVA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaTest {
	/**
	 * Crear objeto factura
	 */
	Factura factura;
	@BeforeEach
	void setUp() throws Exception {
		/**
		 * Declarar la factura como una nueva
		 */
		factura = new Factura();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTotalFactura() {
		/**
		 * Meter productos 
		 * Llamar al método factura que devuelve el precioTotal
		 * Igualarlo con el resultado
		 */
		factura.meterProducto(new Producto("Laptop", 5f, 10));
		factura.meterProducto(new Producto("Smartphone", 6, 10));
		Integer expected = factura.factura();
		Integer resultado = 110;
		assertEquals(expected,resultado,"El metodo TotalFactura no funciona");
	}

	@Test
	void testTotalFacturaConIVA() {
		/**
		 * Meter productos 
		 * Llamar al método factura que devuelve el precioTotal multiplicado por el IVA
		 * Igualarlo con el resultado
		 */
		factura.meterProducto(new Producto("Laptop", 5f, 10));
		factura.meterProducto(new Producto("Smartphone", 6, 10));
		float expected = factura.aplicarIVA(10f);
		float resultado = 99;
		assertEquals(expected,resultado,"El metodo TotalFacturaConIVA no funciona");
	}

}
