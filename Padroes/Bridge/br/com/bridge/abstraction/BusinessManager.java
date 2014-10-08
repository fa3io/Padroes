package br.com.bridge.abstraction;

import br.com.implementor.DataAccess;

public class BusinessManager {
	
	protected  DataAccess dataAccess;

	public void insert(String name) {
		this.dataAccess.create(name);
		
	}

	public void setDataAccess(DataAccess dataAccess) {
		this.dataAccess = dataAccess;
		
	}

	public void print() {
		this.dataAccess.print();
		
	}

	public void delete(String name) {
		this.dataAccess.remove(name);
		
	}



}
