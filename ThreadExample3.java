class RandomNumber extends Thread{
    private int[] numbers = new int[1000];
    private int limit;
    private double average;

    public RandomNumber(int limit){
        this.limit= limit;
    }
    public void computeAverage(){
        int sum=0;
        for(int num: numbers){
            sum+=num;
        }
        average=sum/1000.0;
    }
    public double getAverage(){
        return average;
    }
    public void run(){
        for (int i=0; i<1000; i++){
            numbers[i]= (int)(Math.random()*limit);
        }
        computeAverage();
    }

}
public class ThreadExample3 {
    public static void main(String[] args) {
        RandomNumber r1 = new RandomNumber(2000);
        RandomNumber r2 = new RandomNumber(3000);
        r1.start();
        r2.start();
        try{
            r1.join();
            r2.join();
        }
        catch (InterruptedException e){
            System.out.println("Exception: "+ e.getMessage());
        }
        System.out.println("Average for limit 2000 is: "+r1.getAverage());
        System.out.println("Average for limit 3000 is: "+r2.getAverage());

    }
}
