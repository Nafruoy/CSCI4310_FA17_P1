import java.util.Random;

public class BusinessPeople extends Persons {
	private int BusinessNumbers;
	private int NumberFloors;
	
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
