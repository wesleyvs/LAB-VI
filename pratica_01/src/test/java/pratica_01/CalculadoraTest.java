package pratica_01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	/*Este teste ir� vereficar se o calculo do m�todo raizCubica
	da classe Calculadora ir� retornar o resultado corretamente.*/
	@Test
	public void calcRaizCubica() {
		Calculadora calc = new Calculadora();
		double resultado = calc.raizCubica(27);
		assertEquals(2, resultado);
	}
}