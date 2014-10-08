package br.com.factory;

public class Teste {

	public static void main(String[] args) {
		Forma forma = Forma.getForma(2);
		System.out.println(forma);
		forma.calculaArea();
		
		Forma forma1 = Forma.getForma(2, 3);
		System.out.println(forma1);
		forma1.calculaArea();

		
	}
}
