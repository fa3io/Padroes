package br.com.bridge.abstraction;


public class ProductManagerObject extends BusinessManager {

	@Override
	public void print() {
		System.out.println("-----------");
		System.out.println("Products:");
		System.out.println("-----------");
		super.print();
	}
}
