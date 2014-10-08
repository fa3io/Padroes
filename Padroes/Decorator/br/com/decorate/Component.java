package br.com.decorate;

public abstract class Component {

	protected String nome;
	
	
	public String getNome() {
		return nome;
	}
	public abstract String getHtml();
}
