package zoo;

public abstract class Animal {
	 private String name;
	 private double weight;
	 private int age;
	 
	 public Animal() {
		 name = "unknown";
		 age = 0;
		 weight = 0.0;
		 
	 }
	 
	 public Animal(int age, String name, double weight) {
		 this.name = name;
		 this.weight = weight;
		 this.age = age;
	 }
	 
	 public abstract String makeNoise();
	 
	 public double getWeight() {
		 return weight;
	 }
	 
	 public String toString() {
		 return name + ": " + age + " years old   " + " " + weight + " lbs   ";
	 }
}
