package br.com.bridge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.implementor.DataAccess;

public class ProductIndexedImpl extends DataAccess {
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
		int index = 0;
		
		while (i.hasNext()) {
			System.out.println(++index+" - "+i.next());
		}
	}
}
