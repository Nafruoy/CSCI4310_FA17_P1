import java.util.Random;

public class WorkerPeople extends Persons {
	private int WorkerNumbers;
	private int NumberFloors;
	
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
