import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class Elevator {
	private int numberHumanIn;
	private final int MAX_FLOOR = 10;
	private final int MIN_FLOOR = 1;
	private final int MAX__PERSONS = 5;
	public int FloorDestination = 0;
	
	public Elevator(){
		numberHumanIn = 0;	
	}
	
	public void setNumberHumanIn(int n){
		numberHumanIn = n;
	}
	
	public int getNumberHumanIn(){
		return numberHumanIn;
	}
	
	public static void sleep(long millis) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println("Still Waiting...");
		}
	}
	
	public static long currentTimeMillis() {
		return 0;
	}
	
	Random randomGenerator = new Random();
	ArrayList<Integer> up = new ArrayList<>(Arrays.asList(MAX_FLOOR));
	int upfloors = randomGenerator.nextInt(up.size());
	

	
	
}
