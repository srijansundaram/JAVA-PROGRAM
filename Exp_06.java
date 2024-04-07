// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Single inheritance: Child class inherits from one parent class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Multilevel inheritance: Child class inherits from another child class
class Labrador extends Dog {
    void color() {
        System.out.println("Labrador is brown in color...");
    }
}

// Hierarchical inheritance: Multiple child classes inherit from the same parent class
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}

public class Exp_06 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited method from Animal
        dog.bark(); // Method specific to Dog

        Labrador labrador = new Labrador();
        labrador.eat();   // Inherited method from Animal
        labrador.bark();  // Inherited method from Dog
        labrador.color(); // Method specific to Labrador

        Cat cat = new Cat();
        cat.eat();  // Inherited method from Animal
        cat.meow(); // Method specific to Cat
    }
}
