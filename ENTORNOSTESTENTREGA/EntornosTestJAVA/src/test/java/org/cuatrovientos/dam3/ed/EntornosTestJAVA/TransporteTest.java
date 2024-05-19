package org.cuatrovientos.dam3.ed.EntornosTestJAVA;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransporteTest {
	/**
	 * Crear un objeto tipo Camioneta
	 */
	Camioneta camioneta;
	@BeforeEach
	void setUp() throws Exception {
		/**
		 * Declarar la Camioneta como una nueva Camioneta
		 */
		camioneta = new Camioneta();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPesoTotal() {
		/**
		 * Creamos unos paquetes
		 * Los añadimos a la lista
		 * Llamamos al procedimiento pesoTotal que nos tiene que devolver el valor expected
		 */
		Paquete paquete1 = new Paquete("Madrid", 5.75f);
		Paquete paquete2 = new Paquete("Barcelona", 3.50f);
		camioneta.incluirPaquete(paquete1);
		camioneta.incluirPaquete(paquete2);
		float actual = camioneta.pesoTotal();
		float expected = paquete1.getPeso()+paquete2.getPeso();
		assertEquals(actual,expected,"No funciona el método pesoTota");

	}

	@Test
	void testRecorrerDistancia() {
		/**
		 * Crear un array con numeros del 70 al 100
		 * Con un contains vemos si la funcion recorrerDistancia nos devuelve un numero entre esos valores 
		 */
		Integer actual = camioneta.recorrerDistancia();
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for (int i=70;i<101;i++) {
			expected.add(i);
		}
		assertEquals(expected.contains(actual),true,"No funciona el método RecorrerDistancia");
	}

}
