package br.com.adpter;


// Nossa classe executavel que irá testar as funcionalidades de nosso padrão adapter
public class Client {

	
	
	public static void main(String[] args) {
		
		
		//Ultilizamos uma variavel do tipo Onterface calculator mais com o referencia a um Adapter
		Calculator calc = new Adapter();
		
		//ultilizamos o metodo da interface que por sua vez utiliza  metodos da classe MathLib para realizar o retorno.
		double numero = calc.complexCalculator(10);
		
		System.out.println(numero);
	}
}
