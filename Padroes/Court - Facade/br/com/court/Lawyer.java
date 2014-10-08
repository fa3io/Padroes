package br.com.court;

public class Lawyer {

	public static final int CRIMINAL = 0;
	public static final int CIVIL = 1;
	
	
	//Cliente apenas informa o tipo de processo o advogado que faz a pesquisa 
	//e se relaciona com as justicas e os processos
	public Process getProcess(int type) {

		switch (type) {
		case CRIMINAL:
			Justice criminalJusctice = new CriminalJustice();
			return criminalJusctice.getProcess();

		case CIVIL:
			Justice civilJustice = new CivilJustice();
			return civilJustice.getProcess();
		
		default:
			return null;

		}
	}
}
