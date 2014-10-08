package br.com.court;

public class CriminalJustice implements Justice {

	@Override
	public Process getProcess() {
		CriminalProcess process = new CriminalProcess();
		return process;
	}

}
