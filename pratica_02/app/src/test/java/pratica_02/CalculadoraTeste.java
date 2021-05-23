package pratica_02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
	Calculadora calc = new Calculadora();
	
	//PARTIÇÃO 01
	// CT1: <0, 0>
	@Test
	public void raizCubicaZero() {
		double resultado = calc.raizCubica(0);
		assertEquals(0, resultado, 0.0001);
	}
	
	//PARTIÇÃO 02
	// CT2: <0.01, 0.2154>
	@Test
	public void raizCubicaProximoZeroP() {
		double resultado = calc.raizCubica(0.01);
		assertEquals(0.2154, resultado, 0.0001);
	}
	
	// CT3: <999.9, 9.9996>
	@Test
	public void raizCubicaProximoMilP() {
		double resultado = calc.raizCubica(999.9);
		assertEquals(9.9996, resultado, 0.0001);
	}
	
	//PARTIÇÃO 03
	// CT4: <-0.01, -0.2154>
	@Test
	public void raizCubicaProximoZeroN() {
		double resultado = calc.raizCubica(-0.01);
		assertEquals(-0.2154, resultado, 0.0001);
	}
	
	// CT5: <-999.9, -9.9996>
	@Test
	public void raizCubicaProximoMilN() {
		double resultado = calc.raizCubica(-999.9);
		assertEquals(-9.9996, resultado, 0.0001);
	}
}
