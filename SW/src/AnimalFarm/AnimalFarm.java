package AnimalFarm;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalFarm {
	public String name;
	Scanner sc = new Scanner(System.in);
	ArrayList<Animal> animals = new ArrayList<>();

	public AnimalFarm(String name) {
		this.name = name;
	}

	public void addAnimal(String name, String color, double weight, int type) {
		if (type == 1)
			animals.add(new Dog(name, color, weight));
		else if (type == 2)
			animals.add(new Cat(name, color, weight));
		else if (type == 3)
			animals.add(new Chicken(name, color, weight));
		else
			System.out.println("실패");
	}

	public void findAnimal(String name) {
		Animal temp;
		for (int i = 0; i < animals.size(); i++) {
			temp = animals.get(i);
			if (temp.name.equals(name)) {
				System.out.println("종"+'\t'+"이름"+'\t'+"색깔"+'\t'+"무게");
				System.out.println("======================================");
				temp.printInfo();
			} else {

			}
		}
	}

	public void specificAnimalSpeak(int type) {
		Animal temp;
		for (int i = 0; i < animals.size(); i++) {
			temp = animals.get(i);
			if (temp.type == type) {
				temp.speak();
			} else {

			}
		}
	}

	public void allAnimalSpeak() {
		Animal temp = null;
		for (int i = 0; i < animals.size(); i++) {
			temp = animals.get(i);
			temp.speak();
		}
	}

	public void printAllAnimalInfo() {
		Animal temp = null;
		System.out.println("종"+'\t'+"이름"+'\t'+"색깔"+'\t'+"무게");
		for (int i = 0; i < animals.size(); i++) {
			temp = animals.get(i);
			temp.printInfo();
		}
	}
}
