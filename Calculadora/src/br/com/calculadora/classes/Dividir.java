package br.com.calculadora.classes;

public class Dividir extends Calculadora {

	public Dividir(int numero1, int numero2) {
		super(numero1, numero2);
	}

	@Override
	public Boolean validar() {
		return numero1 >= 0 && numero2 >= 1;
	}

	@Override
	protected int doCalcular() {
		return numero1 / numero2;
	}

}
