package br.com.strategy;

/*
	interface criada para poder desaclopar o metodo desenhar da classe document
	assim temos um baixo acoplamento
*/

public interface DrawBehavior {
	
	public void draw();

}
