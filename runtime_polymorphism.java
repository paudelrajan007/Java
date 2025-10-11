/*
Practice Question — Runtime Polymorphism

Task:

Create a parent class called Animal.

Method: sound() → prints "Animal makes a sound"

Create two child classes:

Dog → overrides sound() → prints "Dog barks"

Cat → overrides sound() → prints "Cat meows"

In the main method:

Create Animal references pointing to Dog and Cat objects.

Call the sound() method using both references.

Hint:

Use inheritance: class Dog extends Animal and class Cat extends Animal

Override the sound() method in both child classes

Use parent class reference pointing to child object:

Animal a1 = new Dog();
Animal a2 = new Cat();
a1.sound(); // calls Dog's method
a2.sound(); // calls Cat's method

*/
class Animal{
    void sound(){
        System.err.println("Animal makes a sound ");
    }
    }
    
    class Dog extends Animal{
        @Override
        void sound(){
            System.err.println("Dog barks ");
        }
    }
    class Cat extends Animal{
        @Override
        void sound(){
            System.err.println("Cat memw ");
        }
}
    public class runtime_polymorphism{

    public static void main(String[] args) {
        Animal a1=new Dog();
        Animal a2=new Cat();


        a1.sound();
        a2.sound();

    }
    }
    
