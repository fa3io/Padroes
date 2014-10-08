package br.com.strategy;

public class Client {

	
	
	public static void main(String[] args) {
		
		//Criando documento
		Document document = new Legal();
		
		
		//Setando for de imprimir
		document.setDrawBehavior(new Pdf());
		
		//imprimindo 1ª vez
		document.performDraw();
		
		//Alterando forma de imprimir em tempo de execução
		document.setDrawBehavior(new Html());

		//imprimindo 2ª vez
		document.performDraw();
		
	}
	
	
	
}
