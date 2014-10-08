package br.com.singleton;

public class Conexao {
	
	private static Conexao instanciaConexao = null;
	private String solicitante = "Desconectado";
	
	private Conexao(){}
	
	
	// Se não existir conexão ele faz se existir devolve a conexão já feita 
	public static Conexao getInstancia(String solicitante){
		if(instanciaConexao == null){
			instanciaConexao = new Conexao();
			instanciaConexao.setSolicitante(solicitante);
		}
		return instanciaConexao;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}
	


	
}
