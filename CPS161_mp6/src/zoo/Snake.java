package zoo;

public class Snake extends Animal {
	private int numFangs;
	
	public Snake(){
		numFangs = 0;
	}
	
	public Snake(String name, double weight, int age, int numFangs){
		super(age, name, weight);
		this.numFangs = numFangs;
	}
	
	public String makeNoise() {
		return "Hisssssss";
	}
	
	public String toString() {
		return super.toString() + "| Snake: " + numFangs + " fangs";
	}
}
