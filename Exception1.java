public class Exception1 {
    public static void main(String[] args) {
        int a[] = new int[10]; // Array with size 10
        int i;
        for (i = 0; i < 10; i++) { // Start from 0 to avoid out-of-bounds error
            try {
                a[i] = i; // Assigning index value to array element
                System.out.println("a[" + i + "] = " + a[i]);

                int k = i / (10 - i); // Prevent division by zero when i == 10
                System.out.println("k = " + k);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Out of Bounds!");
            }
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
            catch (Exception e) {
                System.out.println("General Exception Occurred!");
            }
        }
    }
}
