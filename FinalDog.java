package Lab05;

public class FinalDog extends FinalAnimal {
	public void makeSound() { //Method can not be overridden because parent class has final keyword
		System.out.println("Animals is Dog");
	}
}
