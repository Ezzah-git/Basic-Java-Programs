import java.util.ArrayList;
import java.util.List;
class Students{
    private String name;
    public Students(String name){
        this.name=name;
    }
    public void displayStudents(){
        System.out.println("Student name: "+name);
    }
}
class College{
    //college has students
    private List<Students> students;
    public College(List<Students>students){
        this.students=students;
    }
    public void ShowStudents(){
       for(Students s: students){
           s.displayStudents();
       }
    }
}
public class AggregationExample {
    public static void main(String[] args) {
        Students s1 = new Students("Ali");
        Students s2 = new Students("Ahmed");
        List<Students>studentsList=new ArrayList<>();
        studentsList.add(s1);
        studentsList.add(s2);
        College mycollege= new College(studentsList);
        mycollege.ShowStudents();

    }
}
