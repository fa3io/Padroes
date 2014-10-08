package br.com.observer;

public class TelephoneExchange {

	public static void main(String[] args) {
	
		// instanciação de telefone e pessoa
		Telephone telefone = new Telephone();
		Person fabio = new Person();
		
		//setando quem observará o telefone
		fabio.observeTelephone(telefone);
		
		//ação de telefone de tocar
		telefone.tocou();
		
		
	}

}
