package br.com.decorate;

public class Div extends ContainerDecorator {
	
	private Component component;
	
	public Div(Component component) {
		this.component = component;
	}

	@Override
	public String getName(String valor) {
	
		return component.getNome() + " + DIV";
	}

	@Override
	public String getHtml() {
		
		String temp = "<div>";
		temp += component.getHtml();
		
		return temp + "</div>";
	}

}
