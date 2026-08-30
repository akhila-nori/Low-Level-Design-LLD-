package AbstractClassConceptExample;

// Abstract class acting as a template
abstract class Animal {

    // Concrete method (has a body/implementation)
    public void sleep() {
        System.out.println("Zzz... This animal is sleeping.");
    }

    // Abstract method (has NO body; subclasses MUST implement this)
    public abstract void makeSound();
}

// Concrete subclass 1
class Dog extends Animal {
    // Must implement the abstract method from Animal
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

// Concrete subclass 2
class Cat extends Animal {
    // Must implement the abstract method from Animal
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        // ❌ COMPILATION ERROR: Cannot instantiate the abstract class directly
        // Animal a = new Animal();

        // ✅ ALLOWED: Create objects of the concrete subclasses
        Animal myDog = new Dog();
        myDog.sleep();     // Inherited concrete method
        myDog.makeSound(); // Subclass implementation

        Animal myCat = new Cat();
        myCat.sleep();     // Inherited concrete method
        myCat.makeSound(); // Subclass implementation
    }
}