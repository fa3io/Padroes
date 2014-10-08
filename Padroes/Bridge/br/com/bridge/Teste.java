package br.com.bridge;

import br.com.bridge.abstraction.BusinessManager;
import br.com.bridge.abstraction.ProductManagerObject;
import br.com.implementor.DataAccess;

public class Teste {

	public static void main(String[] args) {
		
		BusinessManager  productsManager = new ProductManagerObject();
		
		DataAccess noIndexed = new ProductNoIndexedImpl();
		DataAccess indexed = new ProductIndexedImpl();
		
		productsManager.setDataAccess(noIndexed);
		
		productsManager.insert("Leite");
		productsManager.insert("Cha");
		productsManager.insert("Feijão");
		productsManager.insert("Café");
		productsManager.insert("Pizza");
		productsManager.insert("Arroz");
		
		productsManager.print();
		
		productsManager.delete("Pizza");
		
		productsManager.print();

	}

}
