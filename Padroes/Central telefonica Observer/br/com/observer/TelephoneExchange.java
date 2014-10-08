package br.com.observer;

public class TelephoneExchange {

	public static void main(String[] args) {
	
		// instancia��o de telefone e pessoa
		Telephone telefone = new Telephone();
		Person fabio = new Person();
		
		//setando quem observar� o telefone
		fabio.observeTelephone(telefone);
		
		//a��o de telefone de tocar
		telefone.tocou();
		
		
	}

}
