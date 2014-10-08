package br.com.iterator;

import java.util.ArrayList;

public class BasketFruits {

	private ArrayList<Product> fruits;
	
	public BasketFruits(){
		fruits = new ArrayList<Product>();
		
		fruits.add(new Product("Maca", "Boa para a voz", 0.99 ));
		fruits.add(new Product("Pera", "Boa para garganta", 1.10 ));
		fruits.add(new Product("Banana", "Fonte carboidrato", 1.20 ));
		fruits.add(new Product("Kiwi", "Fruta rara de encontrar",1.60 ));
		fruits.add(new Product("Abacaxi", "Boa para digestão", 0.80 ));
		
	}
	
	public void addProduct(String name, String description, double price){
		Product product = new Product(name, description, price);
		fruits.add(product);
	}
	
	public Iterator getProducts(){
		return new FruitsIterator(fruits);
		
	}
}
