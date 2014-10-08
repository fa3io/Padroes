package br.com.apart;

public class Apart {
	
	//com todas as partes sendo criados a avulso cada um por seu metodo
	//temos uma classe e  um codigo mais flexivel assim podendo efetuar alterações em subClasses.
	
	
	public Room createRoom(){
		return new Room();	
	}
	public Kitchen createKitchen(){
		return new Kitchen();
	}
	public Bedroom createBedrrom(boolean temSuite, boolean temCloset){
		return new Bedroom(temSuite,temCloset);
	}
	public FloorPlan createFloorPlan(){
		return new FloorPlan();
	}
	
	public FloorPlan createApart(){
	
	FloorPlan floorPalns = createFloorPlan();
	
	Room rom1 =  createRoom();
	floorPalns.addElement(rom1);
	
	Room rom2 =  createRoom();
	floorPalns.addElement(rom2);
	
	Kitchen kitchen = createKitchen();
	floorPalns.addElement(kitchen);
	
	Bedroom  bedroom1 = createBedrrom(true, true); 
	floorPalns.addElement(bedroom1);
	
	Bedroom  bedroom2 = createBedrrom(true, false); 
	floorPalns.addElement(bedroom2);
	
	return floorPalns;
	}
}
