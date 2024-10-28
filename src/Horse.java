import java.util.Random;

public class Horse extends Thread {
    private String name;
    private int distanceToCover;
    private int distanceCovered = 0;
    private Random random;

    public Horse(String name, int distanceToCover) {
        this.name = name;
        this.distanceToCover = distanceToCover;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (distanceCovered < distanceToCover) {
            // Simulate the horse's advancement
            int step = random.nextInt(10) + 1; // Moves forward by 1-10 meters
            distanceCovered += step;
            if (distanceCovered > distanceToCover) {
                distanceCovered = distanceToCover; // Do not exceed the distance
            }
            System.out.println(name + " has covered " + distanceCovered + " meters.");
            try {
                Thread.sleep(500); // Wait half a second before the next step
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " has completed the race!");
    }
}
