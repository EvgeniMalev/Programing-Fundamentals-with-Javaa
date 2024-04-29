import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dungeonestDark(scanner);
    }

    public static void dungeonestDark(Scanner scanner) {
        int health = 100;
        int coins = 0;
        int bestRoom = 0;
        boolean death = false;
        String[] roomArr = scanner.nextLine().split("\\|");
        for (String i : roomArr) {
            bestRoom++;
            String[] line = i.split(" ");
            String room = line[0];
            int value = Integer.parseInt(line[1]);
            if (room.equals("potion")) {
                potion(value, health);
            } else if (room.equals("chest")) {
                chest(value, coins);
            } else {
                monster(room, value, health);
                if (death) {
                    System.out.println("Best room: " + bestRoom);
                    break;
                }
            }
        }
        if (!death) {
            System.out.println("You've made it!");
            System.out.println("Coins: " + coins);
            System.out.println("Health: " + health);
        }
    }

    public static void potion(int value, int health) {
        if ((health + value) > 100) {
            System.out.println("You healed for " + (100 - health) + " hp.");
            health = 100;
            System.out.println("Current health: " + health + " hp.");
        } else {
            health += value;
            System.out.println("You healed for " + value + " hp.");
            System.out.println("Current health: " + health + " hp.");
        }
    }

    public static void chest(int value, int coins) {
        coins += value;
        System.out.println("You found " + value + " coins.");
    }

    public static void monster(String room, int value, int health) {
        health -= value;
        if (health > 0) {
            System.out.println("You slayed " + room + ".");
        } else {
            System.out.println("You died! Killed by " + room + ".");
            death = true;
        }
    }
}
