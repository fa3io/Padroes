package br.com.state.errado;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	enum State {OPEN, CLOSE, CANCELED, INVOICE }
	
	private static Integer ID_GENERATION = 1;
	private Integer id;
	private State state;
	private List<Service> services;
	
	
	//Consttrutor é nosso Evento 1 ou seja criação de OS
	public Order(){
		this.state = State.OPEN;
		this.services = new ArrayList<Service>();
		this.id = ID_GENERATION;
		ID_GENERATION++;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public List<Service> getServices() {
		return services;
	}
	public void setServices(List<Service> services) {
		this.services = services;
	}
	//Evento (Estado) 2
	public void insertService(Service service){
		switch (state) {
		case OPEN:
			services.add(service);
			break;
		case CLOSE:
			state = State.OPEN;
			services.add(service);
			break;
		case CANCELED:
			System.out.println("Impossivel Inserir Serviço: OS Cancelada");
			break;

		case INVOICE:
			System.out.println("Impossivel Inserir Serviço: OS Faturada");
			break;
		default:
			break;
		}
	}
	//Evento (estado) 3
	public void removeService(Service service){
		switch (state) {
		case OPEN:
			services.remove(service);
			break;
		case CLOSE:
			state = State.OPEN;
			services.remove(service);
			break;
		case CANCELED:
			System.out.println("Impossivel Inserir Serviço: OS Cancelada");
			break;

		case INVOICE:
			System.out.println("Impossivel Inserir Serviço: OS Faturada");
			break;
		default:
			break;
		}
	}
	//Evento (estado) 4
	public void cancelOrder(){
		switch (state) {
		case OPEN:
			state = State.CANCELED;
			break;
		case CLOSE:
			System.out.println("Impossivel Cancelar Ordem: OS Fechada");
			break;
		case CANCELED:
			System.out.println("Ordem já se encontra cancelada");
			break;

		case INVOICE:
			System.out.println("Impossivel Cancelar Ordem: OS Faturada");
			break;
		default:
			break;
		}
	}
	//Evento (estado) 5
	public void requestForPayment(){
		switch (state) {
		case OPEN:
			state = State.CLOSE;
			break;
		case CLOSE:
			System.out.println("Pagamento Já foi Solicitado");
			break; 
		case CANCELED:
			System.out.println("Ordem se encontra cancelada");
			break;

		case INVOICE:
			System.out.println("Ordem já foi faturada Faturada");
			break;
		default:
			break;
		}
	}
	//Evento (estado) 6
	public void PrintInvoice(){
		switch (state) {
		case OPEN:
			System.out.println("Solicite a Requisição de Pagamento");
			break;
		case CLOSE:
			state = State.INVOICE;
			print();
			break;
		case CANCELED:
			System.out.println("Ordem se encontra cancelada");
			break;

		case INVOICE:
			System.out.println("Ordem já foi faturada Faturada");
			break;
		default:
			break;
		}
	}
	public void print(){
		double total = 0;
		
		System.out.println("********************* OS ID: "+this.id+" *********************");
		System.out.println("Status: "+this.state);
		System.out.println("****************************************************\n");
		for (Service service : services) {
			System.out.println(service.getName() + " --- " + service.getPrice());
			total+=service.getPrice();
		}
		System.out.println("___________________________________________________");
		System.out.println("Total da Nota --------- " + total);
	}
}
