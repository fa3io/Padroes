package br.com.command.avancado;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;


//Classe COMMAND intermedia a camada de negocio da interface
public class OpenCommand extends AbstractAction {

	
	private static final long serialVersionUID = 1L;
	private XLSDocument xlsDocument;
	
	public OpenCommand(XLSDocument xlsDocument) {
		super("Open...");
		this.xlsDocument = xlsDocument;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String file = JOptionPane.showInputDialog((Component)arg0.getSource(), "Digite o Nome do Arquivo:");
		
		if(file != null && file.length() > 0){
			xlsDocument.open(file);
		}
	}

}
