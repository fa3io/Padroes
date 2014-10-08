package br.com.state.certo;

public class Open extends State {

	public Open(Order os) {
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
	public void cancelOS() {
		os.setState(os.getCancel());
	}

	@Override
	public void requestPayment() {
		os.setState(os.getClose());
	}
	

}
