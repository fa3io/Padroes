package br.com.factory;

public class Circulo extends Forma {
	
	private int raio;
	
	public Circulo(int raio) {
		this.raio = raio;
	}
	
	@Override
	public String toString() {
		return "Circulo";
	}

	@Override
	public void calculaArea() {
		System.out.println(Math.PI * Math.pow(this.raio, 2) );
	}

	public int getRaio() {
		return raio;
	}

	
	

}
