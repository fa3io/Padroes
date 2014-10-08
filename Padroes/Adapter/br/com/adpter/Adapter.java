package br.com.adpter;


//Com está classe temos funcionalidades de MathLib mais também nos adquamos a interface calculator
public class Adapter extends MathLib implements Calculator {

	@Override
	public double complexCalculator(double numero) {
		
		double y = squareRoot(numero) - 1;
		
		y = sum(numero, y);
		
		return y;
	}

}
