package pratica_01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	/*Este teste irá vereficar se o calculo do método raizCubica
	da classe Calculadora irá retornar o resultado corretamente.*/
	
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