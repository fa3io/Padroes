package br.com.state.certo;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private State open;
	private State close;
	private State canceled;
	private State invoice;

	
	private static Integer ID_GENERATION = 1;
	private Integer id;
	private State state;
	private List<Service> services;
	
	
	//Consttrutor é nosso Evento 1 ou seja criação de OS
	public Order(){
		
		
		open = new Open(this);
		close = new Closed(this);
		canceled = new Canceled(this);
		invoice = new Invoice(this);
		
		this.state = open;
		
		this.services = new ArrayList<Service>();
		this.id = ID_GENERATION;
		ID_GENERATION++;
	}
	
	//Evento (Estado) 2
	public void insertService(Service service){
		state.inserService(service);
		
	}
	//Evento (estado) 3
	public void removeService(Service service){
		state.removeService(service);
		
	}
	//Evento (estado) 4
	public void cancelOrder(){
		state.cancelOS();
		
	}
	//Evento (estado) 5
	public void requestForPayment(){
		state.requestPayment();
	}
	//Evento (estado) 6
	public void PrintInvoice(){
		state.printInvoice();
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

	public State getOpen() {
		return open;
	}

	public State getInvoiced() {
		return invoice;
	}

	public State getCancel() {
		return canceled;
	}

	public State getClose() {
		return close;
	}
}
