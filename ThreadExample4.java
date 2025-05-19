class ReverseData extends Thread {
    int[] numbers;

    public ReverseData(int[] numbers) {
        this.numbers = numbers;
    }

    // Swap method to reverse the array
    private void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    @Override
    public void run() {
        // Reversing the array
        for (int i = 0; i < numbers.length / 2; i++) {
            swap(numbers, i, numbers.length - 1 - i);
        }
    }
}

class CalculateAverage extends Thread {
    int[] numbers;
    double average;

    public CalculateAverage(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        long sum = 0;
        int count = 0;

        // Calculate sum of numbers at odd indexes
        for (int i = 1; i < numbers.length; i += 2) {
            sum += numbers[i];
            count++;
        }

        // Calculate average
        if (count > 0) {
            average = (double) sum / count;
        }
    }

    public double getAverage() {
        return average;
    }
}

public class ThreadExample4 {
    public static void main(String[] args) throws InterruptedException {
        int[] numbers = new int[50000];

        // Populate the array with values 1 to 50000
        for (int i = 0; i < 50000; i++) {
            numbers[i] = i + 1;
        }

        // Create two threads
        ReverseData reverseThread = new ReverseData(numbers);
        CalculateAverage averageThread = new CalculateAverage(numbers);

        // Start the threads
        reverseThread.start();
        averageThread.start();

        // Wait for both threads to finish
        reverseThread.join();
        averageThread.join();

        // Print the average calculated by the second thread
        System.out.println("Average of odd indexed numbers: " + averageThread.getAverage());
    }
}
