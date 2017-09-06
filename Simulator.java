
public class Simulator {

	boolean buildingUpdate = true;
	
	public static void main(String[] args) {
		System.out.println("Now entering the simulator");
		
		Building Building = new Building();
		WorkerPeople Workerpeople = new WorkerPeople();
		ExecutivePeople Executivepeople = new ExecutivePeople();
		BusinessPeople Businesspeople = new BusinessPeople();
	
		Building.setNumberFloors(10);
		
		//Numbers will not be updated in the final version. 
		System.out.println("Number of floors: "+Building.getNumberFloors());
		System.out.println("Number of Workers: "+Workerpeople.getDecisionWorkers());
		System.out.println("Number of Executives: "+Executivepeople.getDecisionExecutive());
		System.out.println("Number of Businesses: "+Businesspeople.getDecisionBusiness());
		
		
		//This will be updated.
		System.out.print(Executivepeople.getNumberFloor());
		System.out.print(Businesspeople.getNumberFloor());
		System.out.print(Workerpeople.getNumberFloor());
		
		/*while(buildingUpdate)
		{
		 // going to the another update method in the Building class
			
	     ghghghghgh
	         
		}*/
			

	}

}
