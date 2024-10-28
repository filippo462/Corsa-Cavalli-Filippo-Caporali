import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the course in meters: ");
        int courseLength = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left

        Race race = new Race(courseLength);
        System.out.print("Enter the number of horses: ");
        int numberOfHorses = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left

        for (int i = 0; i < numberOfHorses; i++) {
            System.out.print("Enter the name of horse " + (i + 1) + ": ");
            String horseName = scanner.nextLine();
            race.addHorse(horseName);
        }

        race.startRace();
        scanner.close();
    }
}

