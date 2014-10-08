package br.com.state.certo;

public class Closed extends State {

	public Closed(Order os) {
		super(os);
		
	}

	@Override
	public void inserService(Service service) {
		os.getServices().add(service);
		os.setState(os.getOpen());
	}

	@Override
	public void removeService(Service service) {
		os.getServices().remove(service);
		os.setState(os.getOpen());
	}

	@Override
	public void printInvoice() {
		os.setState(os.getInvoiced());
	}
	

}
