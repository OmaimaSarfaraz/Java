package Practice;

public class Constructor {
	String name;
    int age;
    Constructor(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}