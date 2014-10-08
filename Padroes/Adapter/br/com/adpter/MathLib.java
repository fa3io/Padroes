package br.com.adpter;

//Classe que será adptada


//Classe de outro projeto que queremos adaptar para nosso projeto atual 
//Atraves do framework adpter, a classe já possui varios metodos anteriores
public class MathLib {
	
	
	//Metodo já existentes
	public double squareRoot(double numero){
		return Math.sqrt(numero);
	}
	
	//Metodo já existente
	public double sum(double a , double b){
		return a + b;
	}

}
