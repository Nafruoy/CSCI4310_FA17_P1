
public class Building {
	private Elevator elevator;
	private int numberFloors;
	private boolean startElevator;
	private boolean stopElevator = false;
	
	public void setElevator(){
		this.elevator = elevator;
	
	}
	
	public void setFloor(){
		this.numberFloors = numberFloors;
	}
	
	public void setStopElevator(boolean stopElevator){
		this.stopElevator = stopElevator;
	}
	
	public Elevator getElevator(){
		return elevator;
	}
	
	public void setNumberFloors(int n){
		numberFloors = n;
	}
	
	public int getNumberFloors(){
		return numberFloors;
	}
	

}
