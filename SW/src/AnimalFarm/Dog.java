package AnimalFarm;

public class Dog extends Animal {
	public Dog(String name, String color, double weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.type = 1;
	}

	public void speak() {
		System.out.println(name + ": " + "왈왈"+'\n');
	}

	public void printInfo() {
		System.out.println("개" + '\t' + name + '\t' + color + '\t' + weight+'\n');
	}
}
