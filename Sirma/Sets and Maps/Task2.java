import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, ArrayList<Double>> studentRecords = new TreeMap<>();
        
        System.out.println("Enter number of records:");
        int numRecords = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Enter student names and grades:");
        for (int i = 0; i < numRecords; i++) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Invalid input. Please enter a name followed by a grade.");
                continue;
            }
            
            String name = parts[0];
            double grade;
            try {
                grade = Double.parseDouble(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade: " + parts[1]);
                continue;
            }

            studentRecords.putIfAbsent(name, new ArrayList<>());
            studentRecords.get(name).add(grade);
        }
        
        System.out.println("\nStudent Grades and Averages:");
        for (Map.Entry<String, ArrayList<Double>> entry : studentRecords.entrySet()) {
            String name = entry.getKey();
            ArrayList<Double> grades = entry.getValue();
            double average = grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            
            System.out.print(name + ": ");
            for (Double grade : grades) {
                System.out.print(String.format("%.2f", grade) + " ");
            }
        }

        scanner.close();
    }
}
