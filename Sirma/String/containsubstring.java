import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String substringToRemove = scanner.nextLine();

        String originalString = scanner.nextLine();

        while (originalString.contains(substringToRemove)) {
            originalString = originalString.replace(substringToRemove, "");
        }

        System.out.println(originalString);
      
        scanner.close();
    }
}
