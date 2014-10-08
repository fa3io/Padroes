package br.com.singleton;

public class CadastroCliente {
	
	public static void main(String[] args) {
		
		
		// 1ª Solicitação de Classe
		Conexao con  = Conexao.getInstancia("Fábio Santos Alves");
		
		//2ª Solicitação de Classe
		Conexao con2 = Conexao.getInstancia("Luiza");
		
		//3ª Solicitação de Classe
		Conexao con3 = Conexao.getInstancia("Eder Garcia");
		
		System.out.println(con.getSolicitante());
		System.out.println(con2.getSolicitante());
		System.out.println(con3.getSolicitante());
		
	}

}
