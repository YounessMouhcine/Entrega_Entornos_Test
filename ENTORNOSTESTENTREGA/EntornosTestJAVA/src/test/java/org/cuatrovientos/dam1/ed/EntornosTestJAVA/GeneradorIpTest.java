/**
 * 
 */
package org.cuatrovientos.dam1.ed.EntornosTestJAVA;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class GeneradorIpTest {
	/**
	 * Crear Objeto GeneradorIP
	 */
	GeneradorIp targeter;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		/**
		 * Declarar el GeneradorIp como uno nuevo
		 */
		targeter = new GeneradorIp();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGenerarNumero() {
		/**
		 * Meter todos los valores del 0 a 255 en una lista
		 * Preguntar si el resultado es contenido de la lista con un indexof
		 */
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for (int i=0;i<255;i++) {
			expected.add(i);
		}
		Integer resultado = targeter.generarNumero(0, 255);
		assertEquals(expected.indexOf(resultado),resultado,"No genera correctamente el test");
	}

	@Test 
	void testGenerarIp() {
		/**
		 * Genera una Ip
		 * Preguntar que si empieza o termine en rojo, de rojo el test
		 */
		String ip=targeter.generarIp();
		boolean expected = false;
		assertEquals(ip.startsWith("0"),expected,"La ip no puede empezar por 0");
		assertEquals(ip.endsWith("0"),expected,"La ip no puede terminar por 0");
	}

}
