package AnimalFarm;

public class Cat extends Animal {

	public Cat(String name, String color, double weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.type = 2;
	}

	public void speak() {
		System.out.println(name + ": " + "애옹"+'\n');
	}

	public void printInfo() {
		System.out.println("고양이" + '\t' + name + '\t' + color + '\t' + weight+'\n');
	}
}
