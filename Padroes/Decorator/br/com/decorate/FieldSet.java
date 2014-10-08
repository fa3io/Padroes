package br.com.decorate;

public class FieldSet extends ContainerDecorator {
	
	private Component component;
	
	public FieldSet(Component component) {
		this.component = component;
	}

	@Override
	public String getName(String valor) {
	
		return component.getNome() + " + FIELDSET";
	}

	@Override
	public String getHtml() {
		
		String temp = "<fieldset>";
		temp += "<legend>Titulo</legend>";
		temp += component.getHtml();
		
		return temp + "</fieldset>";
	}
}



