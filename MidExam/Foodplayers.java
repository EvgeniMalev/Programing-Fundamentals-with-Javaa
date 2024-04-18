import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int players = scanner.nextInt();
        int energy = scanner.nextInt();
        double waterPerDay = scanner.nextDouble();
        double foodPerDay = scanner.nextDouble();

        double water = waterPerDay * players * days;
        double food = foodPerDay * players * days;

        int arrayLength = days * players;
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        boolean ready = true;

        for (int i = 0; i < array.length; i++) {
            energy -= array[i];
            if (energy <= 0) {
                ready = false;
                System.out.println("You will run out of energy. You will be left with " + String.format("%.2f", food) + " food and " + String.format("%.2f", water) + " water.");
                break;
            }
            if ((i + 1) % 2 == 0) {
                energy *= 1.05;
                water *= 0.7;
            }
            if ((i + 1) % 3 == 0) {
                energy *= 1.10;
                food -= (food / players);
            }
        }
        if (ready) {
            System.out.println("You are ready for the quest. You will be left with - " + String.format("%.2f", energy) + " energy!");
        }
    }
}
