package br.com.iterator;

public class DrinksIterator implements Iterator {
	
	private Product[] products;
	private int index = 0;
	
	public DrinksIterator(Product[] products) {
		this.products = products;
	}

	@Override
	public boolean hasNext() {
		
		return index < products.length && products[index] != null ;
	}

	@Override
	public Object next() {
		
		return products[index++];
	}

}
