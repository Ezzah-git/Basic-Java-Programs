class Book{
    String title;
    Book(String title){
        this.title=title;
    }
    //method that accepts an object
//    syntax
//    ---returnType name(ClassName + object)---
    void display(Book b){
        System.out.println("Book Title: "+ b.title);
    }

}
public class PassingObjAsArgument {
    public static void main(String[] args) {
Book mybook= new Book("HarryPotter");
mybook.display(mybook);
    }
}
