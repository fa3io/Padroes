package br.com.templatemethod;

public class Soma extends Operacao {

	@Override
	public int handlerEfetuarOpecao(int valor1, int valor2) {
		return valor1 + valor2;
	}

}
