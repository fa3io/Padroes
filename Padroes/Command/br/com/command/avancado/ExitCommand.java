package br.com.command.avancado;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;


//Classe COMMAND intermedia a camada de negocio da interface
public class ExitCommand extends AbstractAction {
	
	private static final long serialVersionUID = 1L;

	public  ExitCommand() {
		super("Sair");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		

	}

}
