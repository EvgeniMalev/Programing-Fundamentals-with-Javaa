import java.util.*;
import java.util.Decimal;

public class Main {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");

        LinkedHashMap<Double, Integer> countMap = new LinkedHashMap<>();

        for (String number : numbers) {
            double num = Double.parseDouble(number);

            countMap.put(num, countMap.getorDefault(num, 0) + 1);
        }

        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            System.out.println(df.format(entry.getKey() + " " + entry.getValue());
        }

        scanner.close();
     }
}



