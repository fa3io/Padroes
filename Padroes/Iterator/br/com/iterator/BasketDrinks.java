package br.com.iterator;

public class BasketDrinks {
	
	static final int MAX_PRODUCTS = 4;
	int index = 0;
	Product [] drinks;
	
	public BasketDrinks(){
		drinks = new Product[MAX_PRODUCTS];

		addProduct("Vinho", "Feito com Uva",50.0 );
		addProduct("Champage", "Feito com Cidra", 40.0 );
		addProduct("Run", "Bebida de Pirata", 150.0 );
		
	}
	
	public Iterator getProducts(){
		return new DrinksIterator(drinks);
	}
	public void addProduct(String name, String description, double price){
		Product product = new Product(name, description, price);
		
		if(index < MAX_PRODUCTS){
			drinks[index] = product;
			index++;
		}
		
	}
	
	
	

}
