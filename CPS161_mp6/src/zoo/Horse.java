package zoo;

public class Horse extends Animal {
	private double topSpeed;
	
	public Horse(){
		topSpeed = 0.0;
	}
	
	public Horse(String name, double weight, int age, double topSpeed){
		super(age, name, weight);
		this.topSpeed = topSpeed;
	}
	
	public String makeNoise() {
		return "Whinny";
	}
	
	public String toString() {
		return super.toString() + "| Horse: " + topSpeed + " mph";
	}
}
