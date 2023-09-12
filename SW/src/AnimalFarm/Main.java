package AnimalFarm;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int type;
		String name;
		String color;
		double weight;
		int menu;
		System.out.print("농장 이름 >> ");
		AnimalFarm farm = new AnimalFarm(sc.nextLine());

		while (true) {
			System.out.println("1.동물 추가\n2.동물 검색\n3.특정 동물 울음소리\n"
		+ "4.모든 동물 울음소리\n5.모든 동물 정보 출력\n6.끝내기");
			menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("1. 개 2. 고양이 3. 닭");
				type = sc.nextInt();
				System.out.println("이름");
				sc.nextLine();
				name = sc.nextLine();
				System.out.println("색깔");
				color = sc.nextLine();
				System.out.println("무게");
				weight = sc.nextDouble();

				farm.addAnimal(name, color, weight, type);
			} else if (menu == 2) {
				System.out.println("찾을 동물의 이름");
				sc.nextLine();
				name = sc.nextLine();
				farm.findAnimal(name);
			} else if (menu == 3) {
				System.out.println("1. 개 2. 고양이 3. 닭");
				type = sc.nextInt();
				farm.specificAnimalSpeak(type);
			} else if (menu == 4) {
				farm.allAnimalSpeak();
			} else if (menu == 5) {
				farm.printAllAnimalInfo();
			} else if (menu == 6) {
				return;
			} else {

			}

		}
	}
}
