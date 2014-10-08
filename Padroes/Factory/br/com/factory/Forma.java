package br.com.factory;

abstract public class Forma {
	
	abstract public void calculaArea();
	
	// De acordo com o parametro que recebemos criamos um Objeto Diferente.
	//... serve para representar um Array um 1 ou mais elementos. 
	public static Forma getForma(int... atributos){
		if(atributos.length == 1){
			return new Circulo(atributos[0]);
		}
		if(atributos.length == 2){
			return new Trianglo(atributos[0],atributos[1]);
		}
		return null;
	}

}
