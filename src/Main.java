import Encapsulation.Customer;
import inheritance.Animal;
import inheritance.Dog;

public class Main {
    public static void main(String[] args) {

        Box b1 = new Box();
        b1.initialize(5,10,10);
        b1.volume();
        Customer c1 = new Customer();
        c1.setName("uditha");
        System.out.println(c1.getName());

        Animal animal = new Animal();
        animal.eat();


        Dog dog =new Dog();
        dog.bark();
        dog.eat();


    }
}