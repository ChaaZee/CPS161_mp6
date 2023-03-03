package zoo;

public class Cow extends Animal {
	private int numSpots;
	
	public Cow(){
		numSpots = 0;
	}
	
	public Cow(String name, double weight, int age, int numSpots){
		super(age, name, weight);
		this.numSpots = numSpots;
	}
	
	public String makeNoise() {
		return "Moooo";
	}
	
	public String toString() {
		return super.toString() + "| Cow: " + numSpots + " spots"; 
	}
}
