package br.com.strategy;

public class Pdf implements DrawBehavior {

	@Override
	public void draw() {
		System.out.println("Impressão feita em PDF");
	}

}
