import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a line (or type 'exit' to quit):");
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            int nameStart = line.indexOf("@@@");
            int nameEnd = line.indexOf('|', nameStart + 3); 
            String name = null;
            if (nameStart != -1 && nameEnd != -1 && nameStart < nameEnd) {
                name = line.substring(nameStart + 3, nameEnd);
            }

            int ageStart = line.indexOf('#');
            int ageEnd = line.indexOf('*', ageStart + 1);  
            String age = null;
            if (ageStart != -1 && ageEnd != -1 && ageStart < ageEnd) {
                age = line.substring(ageStart + 1, ageEnd);
            }

            if (name != null && age != null) {
                System.out.println(name + " is " + age + " years old.");
            } else {
                System.out.println("No valid name and age found in the line.");
            }
        }

        scanner.close();
    }
}
