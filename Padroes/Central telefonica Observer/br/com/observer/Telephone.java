package br.com.observer;


//Classe observada
public class Telephone {
	
	
	private TelephoneListener listener;

	public void setListener(TelephoneListener listener) {
		this.listener = listener;
	}
	
	// Metodo quando o telefone toca.
	public void tocou(){
		
		//Podemos ter algum codigo mais.
		//Mas ao evocar este metodo chamaremos o metodo toqueDeTelefone() de nosso atributo TelephoneListener. 
		this.listener.toqueDeTelefone();
		
	}

}
