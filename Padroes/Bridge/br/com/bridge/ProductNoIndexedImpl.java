package br.com.bridge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.implementor.DataAccess;

public class ProductNoIndexedImpl extends DataAccess {
	
	private List<String> products = new ArrayList<>();

	@Override
	public void create(String name) {
		this.products.add(name);
	}

	@Override
	public void remove(String name) {
		this.products.remove(name);
	}


	@Override
	public void print() {
		Iterator i = products.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
