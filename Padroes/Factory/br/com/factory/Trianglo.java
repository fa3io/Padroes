package br.com.factory;

public class Trianglo extends Forma {
	
	private int base;
	private int altura;
	
	public Trianglo(int base, int altura) {
	this.base = base;
	this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Triangulo";
	}

	@Override
	public void calculaArea() {
		System.out.println((this.base * this.altura)/2);
		
	}

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}
}
