import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static <T> void swapElements(List<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of boxes: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter box " + (i + 1) + ": ");
            String box = scanner.nextLine();
            list.add(box);
        }
        
        System.out.print("Enter two indexes to swap (0-based): ");
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        
        swapElements(list, index1, index2);
        
        System.out.println("List after swapping:");
        for (String element : list) {
            System.out.println(element);
        }
        
        scanner.close();
    }
}
