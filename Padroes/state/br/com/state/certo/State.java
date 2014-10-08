package br.com.state.certo;

public abstract class State {
	
	protected Order os;
	
	public State(Order os){
		this.os = os;
	}
	
	public void inserService(Service service){
		System.out.println("Erro Metodo não Implementado");
	}
	public void removeService(Service service){
		System.out.println("Erro Metodo não Implementado");
	} 
	public void cancelOS(){
		System.out.println("Erro Metodo não Implementado");
	}
	public void requestPayment(){
		System.out.println("Erro Metodo não Implementado");
	}
	public void printInvoice(){
		System.out.println("Erro Metodo não Implementado");
	}
	public Order getOs() {
		return os;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}
