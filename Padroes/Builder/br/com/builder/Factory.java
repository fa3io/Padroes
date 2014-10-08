package br.com.builder;

public class Factory {

	public void construct(AShapeBuilder shapeBuilder){
		
		shapeBuilder.buildArea();
		shapeBuilder.buildColor();
		shapeBuilder.buildSides();
	}
}
