package br.com.state.certo;

public class OSClient {

	public static void main(String[] args){
		
		Order os = new Order();
		
		Service service = new Service("Troca de Oleo",10.00);
		Service service2 = new Service("Abastecimento", 20.0);

		os.insertService(service);
		os.insertService(service2);
		
		os.PrintInvoice();
		
		os.removeService(service);
		
		os.requestForPayment();
		
		os.PrintInvoice();
		
		os.print();
		
		
	
		
	}
	
}
