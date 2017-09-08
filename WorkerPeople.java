import java.util.Random;

public class WorkerPeople extends Persons {
	private int WorkerNumbers;
	private int NumberFloors;
	private char elevatorNum;
	private char destination;
	
	public void setDecisionWorkers() {
		WorkerNumbers = super.setDecisionWorkers(3);
	}
	
	public int getDecisionWorkers () {
		Random randomWorkers = new Random();
		WorkerNumbers = randomWorkers.nextInt(11) + 10;
		return WorkerNumbers;
	}
	
	public void setNumberFloors(){
		NumberFloors = super.getFloor();
	}
	
	public void setDestination(){
		destination = Floor;
	}

	public void checkElevator(){
		if (super.state == 'waiting'){
		// A for loop referencing each elevator in the elevator ArrayList should be implemented for the following if statement.
			if (Elevator.onFloor == super.floor && Elevator.type == 'worker' && Elevator.state == 'loading' && Elevator.peopleRiding < 5){
				elevatorNum = Elevator.elevatorNum;
				super.state= 'riding';
			}
		else if (super.state = 'riding'){
			if (Elevator.onFloor == destination){
				super.floor = destination;
				super.state = 'working';
			}
		}	
		}
	}
	
	public String getNumberFloor(){
		Random randomFloors = new Random();
		String floor = "";
		NumberFloors = randomFloors.nextInt(10) + 1;
		if(NumberFloors == 1){
			System.out.println("Worker has entered the Lobby");
		}
		else if(NumberFloors == 2){
			System.out.println("Worker is at floor: "+ NumberFloors);
		}
		
		else if(NumberFloors == 3){
			System.out.println("Worker is at floor: "+ NumberFloors);
		}
		else if(NumberFloors == 4){
			System.out.println("Worker is at floor: "+ NumberFloors);
		}
		
		else if(NumberFloors == 5){
			System.out.println("Worker is at floor: "+ NumberFloors);
		}
		
		else if(NumberFloors == 6){
			System.out.println("Worker is at floor: "+ NumberFloors);
		}
		
		else if(NumberFloors == 7){
			System.out.println("Worker is at floor: "+ NumberFloors);
		}
		else if(NumberFloors == 8){
			System.out.println("Worker is at floor: "+ NumberFloors);
		}
		
		else if(NumberFloors == 9){
			System.out.println("Worker is at floor: "+ NumberFloors);
		}
		
		else if(NumberFloors == 10){
			System.out.println("Worker is at floor: "+ NumberFloors);
		}
		
		
		return floor;
		
		
		
	}
}
