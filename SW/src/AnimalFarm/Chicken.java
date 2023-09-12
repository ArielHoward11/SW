package AnimalFarm;

public class Chicken extends Animal {
	public Chicken(String name, String color, double weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.type = 3;
	}

	public void speak() {
		System.out.println(name + ": " + "꼬꼬댁"+'\n');
	}

	public void printInfo() {
		System.out.println("닭" + '\t' + name + '\t' + color + '\t' + weight+'\n');
	}
}
