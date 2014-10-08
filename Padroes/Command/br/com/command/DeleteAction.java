package br.com.command;

public class DeleteAction implements Command {

	@Override
	public void execute() {
		System.out.println("Delete de Beam efetuado!");
	}

}
