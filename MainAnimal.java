package Interfaces;

public class MainAnimal {

	public static void main(String[] args) {
		InterfacesAnimal d = new Dog();
		d.eat();
		d.makeSound();
		InterfacesAnimal c = new Cat();
		c.eat();
		c.makeSound();

	}

}
