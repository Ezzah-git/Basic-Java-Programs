import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exception2 {
    public static void main(String[] args) {
        int i, k = 0, a[], b[];
        String s = new String();
        System.out.println("Enter any number from 1 to 4: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            s = br.readLine();
        }
        catch (Exception e){
            System.out.println("Invalid input! Please try again");
        }
        i=Integer.parseInt(s);
    }
}
