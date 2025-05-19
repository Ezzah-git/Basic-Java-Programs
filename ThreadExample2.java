class RandomThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName() + " : " + i);
        }
    }
}
public class ThreadExample2{
    public static void main(String[] args) {
        RandomThread t1 = new RandomThread();
        RandomThread t2 = new RandomThread();

        t1.setName("Ezzah");
        t2.setName("SW");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }

        System.out.println("Main thread ends after child threads!");
    }
}