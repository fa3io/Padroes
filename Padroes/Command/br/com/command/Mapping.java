package br.com.command;

import java.util.HashMap;
import java.util.Map;

public class Mapping {
	
	private Map<String, Command> commands = new HashMap<String, Command>();

	public void register(String nome, Command command){
		commands.put(nome, command);
	}
	public void execute(String nome){
		Command command = commands.get(nome);
		
		if(command != null){
			command.execute();
		}
	}
}
