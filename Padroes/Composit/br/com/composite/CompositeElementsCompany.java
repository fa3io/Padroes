package br.com.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeElementsCompany extends ElementsCompany {
	
	private List<ElementsCompanyIF> elements = new ArrayList<ElementsCompanyIF>();

	public CompositeElementsCompany(String name) {
		super(name);
		
	}

	@Override
	public void add(ElementsCompanyIF element) {
		this.elements.add(element);

	}

	@Override
	public void remove(ElementsCompanyIF element) {
		this.elements.remove(element);

	}

	@Override
	public void display(String ident) {
		System.out.println(ident + this);
		
		ident += "   ";
		
		for (ElementsCompanyIF elements : elements) {
				elements.display(ident);
		}
		
		

	}

}
