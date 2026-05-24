package Practice;

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myDog = new Dog();
        myDog.makeSound();
	}
}

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}