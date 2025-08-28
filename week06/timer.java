public class Timer {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 10; // countdown from 60 seconds

        for (int i = seconds; i >= 0; i--) {
            System.out.printf("Time left: %02d seconds%n", i);
            Thread.sleep(1000); // wait for 1 second
        }

        System.out.println("💥 BOOM SABOG! 💥");
    }
}
