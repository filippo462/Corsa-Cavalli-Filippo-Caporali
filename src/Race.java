
import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Horse> horses;
    private int courseLength;

    public Race(int courseLength) {
        this.courseLength = courseLength;
        this.horses = new ArrayList<>();
    }

    public void addHorse(String name) {
        horses.add(new Horse(name, courseLength));
    }

    public void startRace() {
        // Start the horse threads
        for (Horse horse : horses) {
            horse.start();
        }

        // Wait for all horses to finish the race
        for (Horse horse : horses) {
            try {
                horse.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("The race is over!");
    }
}
