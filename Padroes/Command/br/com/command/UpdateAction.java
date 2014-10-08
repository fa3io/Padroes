package br.com.command;

public class UpdateAction implements Command {

	@Override
	public void execute() {
		System.out.println("Update de Beam efetuado!");
	}

}
