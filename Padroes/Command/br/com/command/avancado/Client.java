package br.com.command.avancado;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Client extends JFrame {

	private static final long serialVersionUID = 1L;

	public Client(JMenuBar barraDeMenu) {
		setTitle("Padrão Command");
		setSize(500, 250);
		setJMenuBar(barraDeMenu);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		JMenuBar barraDeMenu = new JMenuBar();
		JMenu menu = new JMenu("Comandos");
		
		XLSDocument xls = new XLSDocument();
		
		
		// Instanciando as classes commands 
		OpenCommand open = new OpenCommand(xls);
		ExitCommand exit = new ExitCommand();
		
		
		//podemos mudar o menu ou quem solicita que não tem impacto com a classe XLSDocument que executa a ação 
		menu.add(open);
		menu.add(exit);
		
		barraDeMenu.add(menu);
		
		new Client(barraDeMenu);
		
	}
}
