package br.com.composite;

public class Employee extends ElementsCompany {

	public Employee(String name) {
		super(name);
	}

	@Override
	public void add(ElementsCompanyIF element) {
		System.out.println("N�o � possivel adicionar Aqui !!!");
	}

	@Override
	public void remove(ElementsCompanyIF element) {
		System.out.println("N�o � possivel removere Aqui !!!");
	}

	@Override
	public void display(String ident) {
	System.out.println(ident + this);
	}

}
