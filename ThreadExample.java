import java.util.Scanner;
class MyThread extends Thread{
    public void run(){
        System.out.println("Printing fixed range thread: ");
        for (int i=1 ; i<=20; i++){
            System.out.print(i+" ");
        }
    }
}
class UserRangeThread extends Thread{
    private int limit;

    UserRangeThread(int limit){
        this.limit = limit;
    }
    public void run(){
        System.out.println("\nPrinting numbers within limit: ");
        for (int i=1 ; i<=limit; i++){
            System.out.print(i+" ");
        }
    }
}
public class ThreadExample{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter limit for thread 2: ");
        int userLimit = sc.nextInt();
        MyThread t1 = new MyThread();
        UserRangeThread t2= new UserRangeThread(userLimit);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        t2.start();
    }
}