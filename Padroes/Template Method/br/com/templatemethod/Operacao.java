package br.com.templatemethod;

abstract public class Operacao {

	//Metodo de implementa��o obrigatoria pelas subClasses
	abstract public int handlerEfetuarOpecao(int valor1 , int valor2);
	
	//Metodo implicito nas SubClasses
	public void efetuarOpecao(int valor1 , int valor2){
		//Implementa��es antes
		
		int resultado = handlerEfetuarOpecao(valor1, valor2);
		System.out.println("Resultado �: " + resultado);
	} 
}
