package br.com.composite;

public class Employee extends ElementsCompany {

	public Employee(String name) {
		super(name);
	}

	@Override
	public void add(ElementsCompanyIF element) {
		System.out.println("Não é possivel adicionar Aqui !!!");
	}

	@Override
	public void remove(ElementsCompanyIF element) {
		System.out.println("Não é possivel removere Aqui !!!");
	}

	@Override
	public void display(String ident) {
	System.out.println(ident + this);
	}

}
