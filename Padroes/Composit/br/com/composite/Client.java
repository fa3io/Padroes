package br.com.composite;

public class Client {

	public static void main(String[] args) {
		
		//Criando a Empresa
		CompositeElementsCompany empresa = new CompositeElementsCompany("Ultragaz S.A");
		
		//Criando Departamentos da Nossa empresa
		CompositeElementsCompany dptMarketing = new CompositeElementsCompany("Marketing");
		CompositeElementsCompany dptTi = new CompositeElementsCompany("TI");
		CompositeElementsCompany dptVendas = new CompositeElementsCompany("Vendas");
		
		
		//Fazendo o 1º Nivel de Hierarquia 
		empresa.add(dptVendas);
		empresa.add(dptTi);
		empresa.add(dptMarketing);
		
		
		//Criando o 2º nivel de Hierarquia
		dptMarketing.add(new Employee("Rute Camila"));
		dptMarketing.add(new Employee("Flavio Santos"));
		
		dptTi.add(new Employee("Fábio Santos"));
		dptTi.add(new Employee("Eder Fagundes"));
		dptTi.add(new Employee("Marcio Dias"));
		
		dptVendas.add(new Employee("Luiz Silva"));
		dptVendas.add(new Employee("Rosalina"));
		
		
		empresa.display("");
	}
	
	
}
