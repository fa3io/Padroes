package br.com.apart;

//criamos um derivado de apartamento 
public class ApartEconomic extends Apart {
	
	//sobrescrevemos o metodo para cria��o de cozinha 
	@Override
	public Kitchen createKitchen() {
		return new americanKitchen();
	}

}
