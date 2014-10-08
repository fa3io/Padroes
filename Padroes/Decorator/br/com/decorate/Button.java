package br.com.decorate;

public class Button extends Component {
	
	public Button() {
		this.nome = "button";
	}

	@Override
	public String getHtml() {
		return "<input type = button value = button>";
	}

}
