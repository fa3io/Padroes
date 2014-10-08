package br.com.composite;


//Componete
public interface ElementsCompanyIF {

	
	abstract public void add(ElementsCompanyIF element);
	abstract public void remove(ElementsCompanyIF element);
	abstract public void display(String ident);
}
