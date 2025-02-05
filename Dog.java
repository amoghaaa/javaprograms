// Derived class
public class Dog extends Animal {
    public Dog(String name) {
        super(name);  // Call the constructor of the base class
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.makeSound();  // This will call the overridden method
    }
}

