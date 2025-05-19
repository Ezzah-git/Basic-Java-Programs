class Animal{
   void eat(){
       System.out.println("Eating....");
    }
}
class Cat extends Animal{
    void walk(){
        System.out.println("Walking...");
    }
}
class Dog extends Animal{
    void drink(){
        System.out.println("drinking");
    }
}
public class InheritanceExample1 {
    public static void main(String[] args) {
  Animal a = new Animal();
  a.eat();

    }
}
