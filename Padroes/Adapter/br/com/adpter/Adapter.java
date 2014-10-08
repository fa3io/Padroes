package br.com.adpter;


//Com est� classe temos funcionalidades de MathLib mais tamb�m nos adquamos a interface calculator
public class Adapter extends MathLib implements Calculator {

	@Override
	public double complexCalculator(double numero) {
		
		double y = squareRoot(numero) - 1;
		
		y = sum(numero, y);
		
		return y;
	}

}
