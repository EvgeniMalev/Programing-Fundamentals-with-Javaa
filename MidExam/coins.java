import java.util.Scanner;

public class coins {
   public static void main(String args[]) {
  
      Scanner scanner = new Scanner(System.in);

     int energy = 100;
     int coins = 100;
     int players = Integer.parseInt(scanner.nextLine());
     int waterperday = Integer.parseInt(scanner.nextLine());
     int foodperday = Integer.parseInt(scanner.nextLine());


     String[] array = scanner.nextLine().split("\\|");
     boolean bankrupt = false;
    for (String i : array) {
        String[] line = i.split("-");
        int value = Integer.parseInt(line[1]);
        if (line[0].equals("rest")) {
            if ((energy + value) <= 100) {
                energy += value;
                System.out.println("You gained " + value + " energy.");
                System.out.println("Current energy: " + energy + ".");
            }
            else {
                System.out.println("You gained " + (100 - energy) + " energy.");
                energy = 100;
                System.out.println("Current energy: " + energy + ".");
            }
        }
        else if (line[0].equals("order")) {
            if (energy >= 30) {
                coins += value;
                energy -= 30;
                System.out.println("You earned " + value + " coins.");
            }
            else {
                energy += 50;
                System.out.println("You had to rest!");
            }
        }
        else {
            if (coins > value) {
                System.out.println("You bought " + line[0] + ".");
                coins -= value;
            }
            else {
                System.out.println("Closed! Cannot afford " + line[0] + ".");
                bankrupt = true;
                break;
            }
        }
    }
    if (!bankrupt) {
        System.out.println("Day completed!");
        System.out.println("Coins: " + coins);
        System.out.println("Energy: " + energy);
    }
}
}
