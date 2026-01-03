package inheritance;
//super class
class Animal{
	String name;
	int age;
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
	
}
//sub class
class Dog extends Animal{
	void makeSound(){
		System.out.println("Dog barks!!");
	}
}
//sub class
class Cat extends Animal{
	void makeSound() {
		System.out.println("Cat meows~~");
	}
}
//sub class
class Bird extends Animal{
	void makeSound() {
		System.out.println("Birds Chirp!!!");
	}
}
//main class
public class AnimalHierarchy {
	public static void main(String[] args) {
		Animal animal1=new Animal();
		Dog dog=new Dog();
		Cat cat=new Cat();
		Bird bird=new Bird();
		animal1.makeSound();
		dog.makeSound();
		cat.makeSound();
		bird.makeSound();
	}
}
