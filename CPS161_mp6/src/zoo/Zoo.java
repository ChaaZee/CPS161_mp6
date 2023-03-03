package zoo;

import java.util.*;

public class Zoo{
	private int actualNumAnimals;
	private int numCages;
	private Animal[] animals;
	
	public Zoo(){
		numCages = 3;
		actualNumAnimals = 0;
		animals = new Animal[numCages];
	}
	
	public Zoo(int numCages) {
		this.numCages = numCages;
		actualNumAnimals = 0;
		animals = new Animal[numCages];
	}
	
	public void add(Animal a) {
		if(numCages != actualNumAnimals) {
			animals[actualNumAnimals] = a;
			actualNumAnimals += 1;
		} else {
			System.out.println("Zoo is full. Can't add to Zoo");
		}
	}
	
	public double totalWeight() {
		int tWeight = 0;
		for(int i = 0; i < animals.length; i++) {
			tWeight += animals[i].getWeight();
		}
		return tWeight;
	}
	
	public void makeAllNoises() {
		for(int i = 0; i < animals.length; i++) {
			System.out.print(animals[i].makeNoise() + " ");
		}
		System.out.println();
	}
	
	public void printAllAnimals() {
		for(int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].toString());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo z = new Zoo();
		Snake sly = new Snake("Sly", 5.0 , 2, 2);
		Snake sly2 = new Snake("Slyme", 10.0 , 1, 2);
		Cow blossy = new Cow("Blossy", 900., 5, 10);
		Horse prince = new Horse("Prince", 1000., 5, 23.2);
		
		z.add(sly);
		z.add(sly2);
		z.add(blossy);
		z.add(prince);
		z.makeAllNoises();
		
		System.out.println("Total weight: " + z.totalWeight());
		System.out.println("**************************");
		System.out.println("Animal Printout:");
		z.printAllAnimals();
		System.out.println();
		
		System.out.println("********* Now we will make the Second Zoo");
		Zoo z2 = new Zoo(5);
		z2.add(sly);
		z2.add(sly2);
		z2.add(blossy);
		z2.add(prince);
		z2.add( new Horse("Warrior", 1200, 6, 25.3));
		z2.add( new Horse("Harry", 1100, 4, 21.3));
		
		System.out.println("Total weight of z2: "+z2.totalWeight());
		z2.makeAllNoises();
		z2.printAllAnimals();

	}

}
