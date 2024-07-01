/**
A program in Java that gets an index, which is an integer and a double.
Finally the algorythm sorts the integers by biggest value and print them
while the user put the word "exit"
*/

import java.util.*;

import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeMap<Integer, ArrayList<Double>> treeMap = new TreeMap<>();

        System.out.println("Enter index and points (type 'exit' to finish):");

        while (true) {

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String[] parts = input.split(" ");

            if (parts.length != 2) {
                System.out.println("Invalid input. Please enter an index followed by a grade.");
                continue;
            }



            int index;
            double points;
            try {

                index = Integer.parseInt(parts[0]);
                points = Double.parseDouble(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + input);
                continue;

            }



            if (treeMap.containsKey(index)) {
                System.out.println("Invalid input: index " + index + " is already present.");
                continue;
            }



            treeMap.put(index, new ArrayList<>());
            treeMap.get(index).add(points);
        }

        List<Entry<Integer, Double>> sortedEntries = new ArrayList<>();
        for (Entry<Integer, ArrayList<Double>> entry : treeMap.entrySet()) {
            for (Double grade : entry.getValue()) {
                sortedEntries.add(new AbstractMap.SimpleEntry<>(entry.getKey(), grade));
            }
        }
      sortedEntries.sort((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()));

        System.out.println("\nSorted Entries:");

        for (Entry<Integer, Double> entry : sortedEntries) {
            System.out.println("Index: " + entry.getKey() + ", Points: " + entry.getValue());

        }

        scanner.close();
    }
}
