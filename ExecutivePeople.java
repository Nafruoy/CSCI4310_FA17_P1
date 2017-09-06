import java.util.Random;

public class ExecutivePeople extends Persons {
	private int ExecutiveNumbers;
	private int NumberFloors;
	
	public void setDecisionExecutive() {
		ExecutiveNumbers = super.setDecisionExecutive(3);
	}
	
	public int getDecisionExecutive () {
		Random randomWorkers = new Random();
		ExecutiveNumbers = randomWorkers.nextInt(3) + 3;
		return ExecutiveNumbers;
	}
	
	public void setNumberFloors(){
		NumberFloors = super.getFloor();
	}
	
	public String getNumberFloor(){
		Random randomFloors = new Random();
		String floor = "";
		NumberFloors = randomFloors.nextInt(3) + 1;
		if(NumberFloors == 1){
			System.out.println("Executive has entered the Lobby");
		}
		else if(NumberFloors == 2){
			System.out.println("Executive is at floor: "+ NumberFloors);
		}
		
		else if(NumberFloors == 3){
			System.out.println("Executive is at floor: "+ NumberFloors);
		}
		return floor;
		
	}
}
