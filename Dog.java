package Interfaces;

public class Dog implements InterfacesAnimal {

	@Override
	public void makeSound() {
		System.out.println("bow......");
		
	}

	@Override
	public void eat() {
		System.out.println("Chicken");
		
	}
	
	

}
