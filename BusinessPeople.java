import java.util.Random;

public class BusinessPeople extends Persons {
	private int BusinessNumbers;
	private int NumberFloors;
	private char elevatorNum;
	private char destination;
	
	public void setDecisionBusiness() {
		BusinessNumbers = super.setDecisionBusiness(3);
	}
	
	public int getDecisionBusiness () {
		Random randomWorkers = new Random();
		BusinessNumbers = randomWorkers.nextInt(6) + 5;
		return BusinessNumbers;
	}
	
	public void setNumberFloors(){
		NumberFloors = super.getFloor();
	}
	
	public void setDestination(){
		destination = Floor;
	}

	public void checkElevator(){
		if (super.state == 'waiting'){
		// A for loop referencing each elevator in the elevator ArrayList should be implemented for the following 3 if statements.
			if (Elevator.onFloor == super.floor && destination.type == 'business' && (Floor.type == 'business' || Floor.type == 'worker') && Elevator.state == 'loading' && Elevator.peopleRiding < 5){
				elevatorNum = Elevator.elevatorNum;
				super.state= 'riding';
			}
			else if (Elevator.onFloor == super.floor && Elevator.type == 'worker' && destination.type == 'worker' && Elevator.state == 'loading' && Elevator.peopleRiding < 5){
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
		NumberFloors = randomFloors.nextInt(5) + 1;
		if(NumberFloors == 1){
			System.out.println("Business person has entered the Lobby");
		}
		else if(NumberFloors == 2){
			System.out.println("Business person is at floor: "+ NumberFloors);
		}
		
		else if(NumberFloors == 3){
			System.out.println("Business person is at floor: "+ NumberFloors);
		}
		else if(NumberFloors == 4){
			System.out.println("Business person is at floor: "+ NumberFloors);
		}
		
		else if(NumberFloors == 5){
			System.out.println("Business person is at floor: "+ NumberFloors);
		}
		return floor;
		
		
		
	}
}
