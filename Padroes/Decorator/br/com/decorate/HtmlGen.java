package br.com.decorate;

public class HtmlGen {

	public static void main(String[] args) {
	
		Component  checkBox = new CheckBox();
		
		ContainerDecorator container = new Div(checkBox);
		
		System.out.println(container.getHtml());

	}

}
