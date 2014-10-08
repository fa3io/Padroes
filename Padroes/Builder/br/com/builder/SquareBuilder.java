package br.com.builder;

public class SquareBuilder extends AShapeBuilder {
	public  SquareBuilder() {
		shape = new Shape("Square");
	}

	@Override
	public void buildSides() {
		shape.setParts("SIDES", "4");
	}

	@Override
	public void buildColor() {
		shape.setParts("COLOR", "ORANGE");
		
	}

	@Override
	public void buildArea() {
		shape.setParts("AREA", "21");
		
	}
}
