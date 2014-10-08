package br.com.singleton;

public class CadastroCliente {
	
	public static void main(String[] args) {
		
		
		// 1� Solicita��o de Classe
		Conexao con  = Conexao.getInstancia("F�bio Santos Alves");
		
		//2� Solicita��o de Classe
		Conexao con2 = Conexao.getInstancia("Luiza");
		
		//3� Solicita��o de Classe
		Conexao con3 = Conexao.getInstancia("Eder Garcia");
		
		System.out.println(con.getSolicitante());
		System.out.println(con2.getSolicitante());
		System.out.println(con3.getSolicitante());
		
	}

}
