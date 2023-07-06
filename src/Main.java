import Encapsulation.Customer;
import inheritance.Animal;
import inheritance.Dog;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");


        Animal animal = new Animal();
        animal.eat();


        Dog dog =new Dog();
        dog.bark();
        dog.eat();


    }
}