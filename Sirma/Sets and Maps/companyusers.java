import java.util.*;

public class CompanyEmployeeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> companyEmployees = new HashMap<>();

        String input = scanner.nextLine();
        
        while (!input.equals("End")) {
            String[] parts = input.split(" -> ");
            String companyName = parts[0];
            String employeeId = parts[1];

            companyEmployees.putIfAbsent(companyName, new HashSet<>());
            companyEmployees.get(companyName).add(employeeId);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> entry : companyEmployees.entrySet()) {
            System.out.println(entry.getKey());
            for (String id : entry.getValue()) {
                System.out.println("-- " + id);
            }
        }

        scanner.close();
    }
}
