package br.com.iterator;

public class Report_Refatorado {
	
	public void printProducts(Iterator iterator){
		
		while(iterator.hasNext()){
			Product product = (Product) iterator.next();
			System.out.println(product);
		}
	}
	
	public static void main(String[] args) {
		Report_Refatorado report = new Report_Refatorado();
		
		
		report.printProducts(new BasketFruits().getProducts());
		report.printProducts(new BasketDrinks().getProducts());
	}

}
