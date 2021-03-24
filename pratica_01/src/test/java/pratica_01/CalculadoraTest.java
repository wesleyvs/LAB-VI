package pratica_01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	/*Este teste irá vereficar se o calculo do método raizCubica
	da classe Calculadora irá retornar o resultado corretamente.*/
	@Test
	public void calcRaizCubica() {
		Calculadora calc = new Calculadora();
		double resultado = calc.raizCubica(27);
		assertEquals(2, resultado);
	}
}