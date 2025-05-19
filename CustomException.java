import java.util.Scanner;
class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}
public class CustomException {
    public static void verifyAge(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("User is under age. Minimum age required is 18.");
        } else {
            System.out.println("Access granted. You are eligible.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");

        try {
            int age = sc.nextInt();
            verifyAge(age);
        } catch (UnderAgeException e) {
            System.out.println("Access denied: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }

        sc.close();
    }
}