package br.com.command;

public class Client {

	public static void main(String[] args) {
		
		Mapping mapping = new Mapping();
		
		mapping.register("create", new CreateAction());
		mapping.register("update", new UpdateAction());
		mapping.register("delete", new DeleteAction());
		
		
		mapping.execute("update");
		
		
	}
}
