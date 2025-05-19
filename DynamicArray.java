public class DynamicArray {
    private int size=0;
    private int count=0;
    int[]arr;
    public DynamicArray(int size){
        arr = new int[size];
        this.size= size;
    }
   public void isFull(){
        if(size==count){
            System.out.println("Array is full!");
            arr = makeDynamic();
        }
   }
   private int[] makeDynamic(){
        int oriSize = size;
        size= size*2;
        int[] dummy = new int[size];
       for (int i = 0; i < oriSize; i++) {
           dummy[i]= arr[i];
       }
       return dummy;
   }
   public void display(){
        for(int a: arr){
            System.out.println(a);
        }
   }
   public void addValue(int val){
        isFull();
        arr[count]=val;
        count++;
   }
   public void updateIndex(int index, int value){
        arr[index]=value;
   }

    public void deleteIndex(int index) {
        int newSize = size - 1; // Reduce size after deletion
        int[] newArr = new int[newSize];
        int newIndex = 0;
        // Copy all elements except the one at the given index
        for (int i = 0; i < count; i++) {
            if (i != index) {
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }
        arr = newArr; // Assign the new smaller array back to arr
        size = newSize; // Update size
        count--; // Reduce the count

        System.out.println("Value at index " + index + " deleted, and array resized!");
    }
    public static void main(String[] args) {
        DynamicArray d = new DynamicArray(2);
        d.addValue(6);
        d.addValue(7);
        d.addValue(9);
        d.addValue(8);
  d.updateIndex(1,6);
  d.deleteIndex(1);
        d.display();
    }
}
