package Lab07;

interface Greeting {
    void sayHello(String name);
    default void sayGoodbye() {
        System.out.println("Goodbye!");
    }
    static void Greet() {
        System.out.println("Welcome to the Java World!");
    }
}