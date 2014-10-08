package br.com.builder;

public abstract class AShapeBuilder {
	protected Shape shape;
	
	public Shape getShape(){
		return this.shape;
	}

	abstract public void buildSides();
	abstract public void buildColor();
	abstract public void buildArea();
}
