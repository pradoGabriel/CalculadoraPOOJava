package br.com.calculadora.classes;

import br.com.calculadora.interfaces.CalculadorMatematico;

public abstract class Calculadora implements CalculadorMatematico {

	protected int numero1;
	protected int numero2;
	
	public Calculadora(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	@Override
	public Boolean validar() {		
		return numero1 >= 0 && numero2 >=0;
	}

	@Override
	public final int calcular() {
		if (validar()) {
			return doCalcular();
		}else {
			return -1;
		}
	}
	
	protected abstract int doCalcular();
}
