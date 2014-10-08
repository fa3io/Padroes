package br.com.observer;


//Observer ou Listenner
public class Person implements TelephoneListener {
	
	public void observeTelephone(Telephone telephone){
		telephone.setListener(this);		
	}

	@Override
	public void toqueDeTelefone() {
		System.out.println("Eu Atendo!!!");
	}

}
