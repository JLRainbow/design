package ch30appendixA;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
//		Cat cat =new Cat("»¨»¨");
//		cat.setShoutNum(6);
//		System.out.println(cat.shout());
//		
//		Dog dog =new Dog("Íú²Æ");
//		dog.setShoutNum(6);
//		System.out.println(dog.shout());
		
//		Animal[] animalArray = new Animal[5];
//		animalArray[0] = new Cat("1");
//		animalArray[1] = new Cat("2");
//		animalArray[2] = new Dog("3");
//		animalArray[3] = new Cat("4");
//		animalArray[4] = new Dog("5");
//		for (Animal animal : animalArray) {
//			System.out.println(animal.shout());
//		}
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Cat("1"));
		animalList.add(new Cat("2"));
		animalList.add(new Dog("3"));
		animalList.add(new Cat("4"));
		animalList.add(new Dog("5"));
		for (Animal animal : animalList) {
			System.out.println(animal.shout());
		}
	}
	
	
}
