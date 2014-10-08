package br.com.builder;

public class Teste {
	
	public static void main(String[] args) {
		
		Factory factory = new Factory();
		
		AShapeBuilder builder1 = new SquareBuilder();
		AShapeBuilder builder2 = new CirculoBuilder();
		AShapeBuilder builder3 = new TrianguleBuilder();
		
		factory.construct(builder1);
		System.out.println(builder1.getShape());
		
		factory.construct(builder2);
		System.out.println(builder2.getShape());
		
		factory.construct(builder3);
		System.out.println(builder3.getShape());
		
	}

}
