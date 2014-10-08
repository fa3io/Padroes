package br.com.builder;

import java.util.HashMap;
import java.util.Map;

public class Shape {
	private String type;
	private Map<String, String> parts = new HashMap<String, String>();
	
	public Shape(String type){
		this.type = type;
	}
	public Object getParts(String key){
		return this.parts.get(key);
	}
	public void setParts(String key, String value){
		this.parts.put(key, value);
	}
	@Override
	public String toString() {
		return "Shape: "+this.type+" (Sides = "+this.getParts("SIDES")+" Color = "+this.getParts("COLOR")+
																	" Area =  "+ this.getParts("AREA")+")";
	}
	

}
