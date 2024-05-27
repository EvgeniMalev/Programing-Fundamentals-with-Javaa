import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeizeTheFire {
    public static void seizeTheFire(String[] input) {
        String[] fireArray = input[0].split("#");
        int water = Integer.parseInt(input[1]);
        double effort = 0;
        List<Integer> array = new ArrayList<>();

        for (String i : fireArray) {
            String[] line = i.split(" = ");
            String fire = line[0];
            int cells = Integer.parseInt(line[1]);

            if (water - cells >= 0) {
                if (fire.equals("Low") && (0 < cells && cells <= 50)) {
                    water -= cells;
                    effort += cells;
                    array.add(cells);
                } else if (fire.equals("Medium") && (50 < cells && cells <= 80)) {
                    water -= cells;
                    effort += cells;
                    array.add(cells);
                } else if (fire.equals("High") && (80 < cells && cells <= 125)) {
                    water -= cells;
                    effort += cells;
                    array.add(cells);
                }
            }
        }

        System.out.println("Cells:");
        for (int j : array) {
            System.out.println(" - " + j);
        }
        System.out.printf("Effort: %.2f%n", (effort * 0.25));
        System.out.println("Total Fire: " + (int) effort);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        

        String fireData = scanner.nextLine();
        String waterAmount = scanner.nextLine();
        
        
        String[] input = {fireData, waterAmount};
        seizeTheFire(input);

    }
}
