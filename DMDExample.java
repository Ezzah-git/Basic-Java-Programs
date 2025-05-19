class Employee{
    String name="Jhon";
    void display(){
        System.out.println(name+" is Manager");
    }
}
class Manager extends Employee{
    String name = "Joseph";
    void display(){
        System.out.println(name+" is employee");
    }
}
public class DMDExample {
    public static void main(String[] args) {
Employee e = new Manager();
e.display();
    }
}
