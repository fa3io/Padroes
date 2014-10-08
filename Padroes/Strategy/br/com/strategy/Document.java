package br.com.strategy;

public abstract class Document {

	
	//atributo abaixo foi colocado para ter mais flexibilidade na de implementar o desenho 
	protected DrawBehavior drawBehavior;
	protected String text;
	
	public void performDraw(){
		drawBehavior.draw();
	}
	
	
	
	public void setDrawBehavior(DrawBehavior drawBehavior) {
		this.drawBehavior = drawBehavior;
	}



	public String getText(){
		return this.text;
	}
	
	public void addText(String text){
		this.text += text;
	}
}
