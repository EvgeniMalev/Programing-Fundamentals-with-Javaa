import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        int flourPrice = Integer.parseInt(scanner.nextLine());
        double eggPrice = flourPrice * 0.75;
        double milkPrice = (flourPrice * 1.25) / 4;
        double cozonacsPrice = flourPrice + eggPrice + milkPrice;
        int totalCozonack = 0;
        int totalEgg = 0;

        while (budget >= cozonacsPrice) {
            budget -= cozonacsPrice;
            totalCozonack++;
            if (totalCozonack % 3 == 0) {
                totalEgg += 3;
                totalEgg -= totalCozonack - 2;
            } else {
                totalEgg += 3;
            }
        }
        System.out.printf("You made %d cozonacs! Now you have %d eggs and %.2f BGN left.\n", totalCozonack, totalEgg, budget);
    }
}
