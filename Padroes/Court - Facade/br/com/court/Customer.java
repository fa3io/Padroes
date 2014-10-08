package br.com.court;

public class Customer {
	
	//Classe cliente não tem nennhum contato com as as partes do judiciario ou com Processos 
	//Apenas se comunica com o Advogado
	
	public static void main(String[] args) {
		
		Lawyer advogado = new Lawyer();
		
		//consumindo o serviço de processo 
		//O Cliente tem acesso a um processo sem instanciar nem a classe Justice e nem uma classe Process e subclasse dela 
		Process processo = advogado.getProcess(Lawyer.CIVIL);
	}

}
