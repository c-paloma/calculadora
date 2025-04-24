package com.calc;

public class Calculadora {
	private int num1;
	private int num2;

	public Calculadora(int a, int b) {
		num1 = a;
		num2 = b;
	}

	public int suma() {
		int resul = num1 + num2;
		return resul;
	}

	public int resta() {
		int resul = num1 - num2;
		return resul;
	}

	public int producto() {
		int resul = num1 * num2;
		return resul;
	}

	public int division() {
		int resul = num1 / num2;
		System.out.println(num1 + " " + num2);
		return resul;
	}

	public int potencia() {
		int resul = (int) Math.pow(num1, num2);
		return resul;
	}

	public int raiz() {
		if (num2 >= 2) {
			int resul = (int) Math.pow(num1, (double) 1 / num2);
			return resul;
		} else {
			return 0;
		}
	}
}