
class MyThread1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

public class ThreadUsingInterface {
    public static void main(String[] args) {
        MyThread1 obj = new MyThread1();
        Thread t1 = new Thread(obj);  // Creating Thread instance
        t1.start();  // Starting thread
    }
}
