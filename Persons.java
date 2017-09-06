import java.util.ArrayList;
import java.util.Random;

public abstract class Persons {
	private int floor;
	private int elevator;
	private int ExecutiveNumbers;
	private int WorkerNumbers;
	private int BusinessNumbers;
	
	public Persons(){
		floor = 0;
		elevator = 0;
		
	}
	
	public void setFloor(int f){
		floor = f;
	}
	
	public void setElevator(int e){
		elevator = e;
	}
	
	public int getFloor(){
		return floor;
	}
	
	public int getElevator(){
		return elevator;
	}
	
	/*public class Executive extends Persons{
		
		
	} for ExecutivePeople.java */
	
	public int setDecisionExecutive (int a) {
		Random randomExecutive = new Random();
		ExecutiveNumbers = randomExecutive.nextInt(3) + 3;
		return ExecutiveNumbers;
	}
	
	/*public class Worker extends Persons{
		
	} for WorkerPeople.java */
	
	public int setDecisionWorkers (int b) {
		Random randomWorkers = new Random();
		WorkerNumbers = randomWorkers.nextInt(11) + 10;
		return WorkerNumbers;
	}
	
	/*public class Business extends Persons{
		
		
	} for BusinessPeople.java */
	
	public int setDecisionBusiness (int c) {
		Random randomBusiness = new Random();
		BusinessNumbers = randomBusiness.nextInt(6) + 5;
		return BusinessNumbers;
	}
	
}



