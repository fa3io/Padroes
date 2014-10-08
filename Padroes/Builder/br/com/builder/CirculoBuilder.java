package br.com.builder;

public class CirculoBuilder extends AShapeBuilder {
	
	public  CirculoBuilder() {
		shape = new Shape("Circle");
	}

	@Override
	public void buildSides() {
		shape.setParts("SIDES", "0");
	}

	@Override
	public void buildColor() {
		shape.setParts("COLOR", "RED");
		
	}

	@Override
	public void buildArea() {
		shape.setParts("AREA", "24");
		
	}

}
