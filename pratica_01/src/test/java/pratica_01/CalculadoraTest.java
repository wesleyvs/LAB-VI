package pratica_01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	/*Este teste ir� vereficar se o calculo do m�todo raizCubica
	da classe Calculadora ir� retornar o resultado corretamente.*/
	
	Calculadora calc = new Calculadora();
	
	@Test
	public void calcRaizCubica() {
		assertEquals(3, calc.raizCubica(27));
	}
	
	@Test
	public void calcRaizCubicaContraTest() {
		assertNotEquals(2, calc.raizCubica(27));
	}
}