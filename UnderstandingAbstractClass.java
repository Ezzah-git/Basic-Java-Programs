/*This is our abstract class
-> can not create objects directly from this class we have to extend this class for creating objs
-> can create both abstract and concrete methods
-> if we create abstract method we must have to override that method in the extended class
* */
abstract class Animal {
    String name;

    //Constructor
    Animal(String name) {
        this.name = name;
    }
//Creating abstract method
    //can not use curly braces because this is an abstract method so we can not implement
    abstract void makeSound();

    //concrete method with body
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}
//Concrete subclass
    class Cat extends Animal {
        /*The super(name); calls the constructor of the parent class (Animal)
        and passes the name argument to it.*/

Cat (String name){
    super(name);
        }
        /*Since we have created the abstract method in the above abstract class
        now we must have to use the abstract method in the extended class
         */
    @Override
    void makeSound(){
        System.out.println(name+" meow! meow!...");
    }
    }

public class UnderstandingAbstractClass {
    public static void main(String[] args) {
//now creating object of the extended class
        Cat c = new Cat("Tom");
        c.makeSound();
        c.sleep();
    }
}
