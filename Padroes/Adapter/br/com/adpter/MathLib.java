package br.com.adpter;

//Classe que ser� adptada


//Classe de outro projeto que queremos adaptar para nosso projeto atual 
//Atraves do framework adpter, a classe j� possui varios metodos anteriores
public class MathLib {
	
	
	//Metodo j� existentes
	public double squareRoot(double numero){
		return Math.sqrt(numero);
	}
	
	//Metodo j� existente
	public double sum(double a , double b){
		return a + b;
	}

}
