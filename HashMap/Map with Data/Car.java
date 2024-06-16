/**  A Program in Java that load a HashMap with added data,
     and a menu fulfilled with while cycle to add more cars
     to the hashmap, to search a car in the hashmap and to
     print the odd vehicles
  */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {        
        Map<String, Integer> vehicles = new HashMap<>();
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a new vehicle");
            System.out.println("2. Search for a vehicle by name");
            System.out.println("3. End and print all vehicles with an odd key length");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    
                    System.out.print("Enter vehicle name: ");
                    String vehicleName = scanner.nextLine();
                    System.out.print("Enter vehicle count: ");
                    int vehicleCount = scanner.nextInt();
                    scanner.nextLine(); 

                    vehicles.put(vehicleName, vehicleCount);
                    break;

                case 2:
                   
                    System.out.print("Enter the vehicle name to search: ");
                    String searchKey = scanner.nextLine();
                    if (vehicles.containsKey(searchKey)) {
                        System.out.println("Found total " + vehicles.get(searchKey) + " " + searchKey + " cars!\n");
                    } else {
                        System.out.println(searchKey + " not found in the map.\n");
                    }
                    break;

                case 3:
                    
                    System.out.println("Vehicles with odd key length:");
                    for (String key : vehicles.keySet()) {
                        if (key.length() % 2 != 0) {
                            System.out.println(key + " - " + vehicles.get(key));
                        }
                    }
                    
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

