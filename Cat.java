package Interfaces;

public class Cat implements InterfacesAnimal {

	@Override
	public void makeSound() {
		System.out.println("meww......");
		
	}

	@Override
	public void eat() {
		System.out.println("milk......");
		
	}
	

}
