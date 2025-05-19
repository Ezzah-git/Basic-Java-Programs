import java.util.ArrayList;

class Items{
    //attributes
    private String name;
    private double price;
    //constructor
    public Items(String name, double price) {
        this.name = name;
        this.price= price;
    }
    //display method
    public void display(){
        System.out.println("Item: "+name+"| Price: "+price+"$");
    }
}
 class GroceryMarket {
    private ArrayList<Items> itemList; //aggregation
    //initializing Arraylist
   public GroceryMarket(){
       itemList= new ArrayList<>();
    }
    //method to add item
     public void addItems(Items item){
       itemList.add(item);
     }
     //method to show items
     void showItems(){
         System.out.println("Available Item in the grocery Market are: ");
         for (Items items: itemList){
             items.display();
         }
     }
 }
public class Aggregation2 {
    public static void main(String[] args) {
        GroceryMarket market = new GroceryMarket();
   Items I1 = new Items("Milk powder",56.9);
   Items I2 = new Items("Cheese",70.9);
   Items I3 = new Items("Bread", 2.6);
   market.addItems(I1);
   market.addItems(I2);
   market.addItems(I3);
   market.showItems();




    }
}
