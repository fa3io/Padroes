package br.com.builder;

public class TrianguleBuilder extends AShapeBuilder {
	public  TrianguleBuilder() {
		shape = new Shape("Triangule");
	}

	@Override
	public void buildSides() {
		shape.setParts("SIDES", "3");
	}

	@Override
	public void buildColor() {
		shape.setParts("COLOR", "BLUE");
		
	}

	@Override
	public void buildArea() {
		shape.setParts("AREA", "50");
		
	}


}
