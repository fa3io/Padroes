package br.com.decorate;

public class CheckBox extends Component {
	
	public CheckBox() {
		this.nome = "checkbox";
	}

	@Override
	public String getHtml() {
		return "<input type = checkbox name = checkbox>";
	}
}