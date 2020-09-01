package br.com.calculadora.fabricas;

import br.com.calculadora.classes.*;
import br.com.calculadora.interfaces.CalculadorMatematico;

public class FabricaCalculosMatematicos {
	
	public CalculadorMatematico criarCalculador(int numero1, int numero2, String calculo) {
		switch (calculo){
			case ("+"):
				return new Somar(numero1,numero2);
			case ("-"):
				return new Subtrair(numero1, numero2);
			case ("*"):
				return new Multiplicar(numero1, numero2);
			case ("/"):
				return new Dividir(numero1, numero2);
			default:
				return null;
		}
	}
}
