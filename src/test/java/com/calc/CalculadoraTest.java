package com.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	static Calculadora calculadora;

	@BeforeEach
	public void initCalculador() {
		calculadora = new Calculadora(6, 2);
	}

	@Test
	void testSuma() {
		assertEquals(8, calculadora.suma());
	}

	@Test
	void testResta() {
		assertEquals(4, calculadora.resta());
	}

	@Test
	void testProducto() {
		assertEquals(12, calculadora.producto());
	}

	@Test
	void testDivision() {
		assertEquals(3, calculadora.division());
	}

	@Test
	void raiz() {
		Calculadora calculadora = new Calculadora(8, 3);
		int resultado = calculadora.raiz();
		assertEquals(resultado, 2);
	}

	@Test
	void testDivisionException() {
		calculadora = new Calculadora(6, 0);
		assertThrows(ArithmeticException.class, () -> calculadora.division());
	}

}
