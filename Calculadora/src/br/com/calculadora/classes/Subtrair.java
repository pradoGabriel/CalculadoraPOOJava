package br.com.calculadora.classes;

public class Subtrair extends Calculadora{

	public Subtrair(int numero1, int numero2) {
		super(numero1, numero2);
		
	}

	@Override
	protected int doCalcular() {
		return numero1 - numero2;
	}

}
