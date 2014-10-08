package br.com.templatemethod;

public class Teste {

	public static void main(String[] args) {

		Operacao operacao = new Soma();
		Operacao operacao2 = new Subtracao();
		

		
		operacao.efetuarOpecao(10, 5);
		operacao2.efetuarOpecao(10, 5);
	}

}
