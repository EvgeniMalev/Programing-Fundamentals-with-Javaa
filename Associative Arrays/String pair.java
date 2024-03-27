/**
 * A program that print a pair of a String and an Integer
 * The number of the pairs is also printed having been read directly by the List
*/

import java.util.*;

public class Stringpair {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pair<String, Integer>> cars = new ArrayList<>();

        System.out.println("Enter car make and model");
        String input = scanner.nextLine();

        while (!input.equals("exit")) {
            String[] parts = input.split(" ");
            if (parts.length == 2) {
                String make = parts[0];
                int model = Integer.parseInt(parts[1]);
                cars.add(new Pair<>(make, model));
            } else {
                System.out.println("Invalid input. Please enter in the format: make model");
            }
            input = scanner.nextLine();
        }

        System.out.println("Number of cars: " + cars.size());

        for (Pair<String, Integer> car : cars) {
            System.out.println(car.getFirst() + ": " + car.getSecond());
        }
    }

    static class Pair<A, B> {
        private final A first;
        private final B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }

        public A getFirst() {
            return first;
        }

        public B getSecond() {
            return second;
        }
    }
}
