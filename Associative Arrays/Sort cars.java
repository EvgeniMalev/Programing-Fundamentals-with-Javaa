
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();


        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String, Integer> productsQuantity = new LinkedHashMap<>();


        while (!input.equals("buy")) {
            String product = input.split(" ")[0];
            double pricePerProduct = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);


            productsPrice.put(product, pricePerProduct);


            if (!productsQuantity.containsKey(product)) {
                productsQuantity.put(product, quantity);
            } else {
                productsQuantity.put(product, productsQuantity.get(product) + quantity);
                productsPrice.put(product, productsPrice.get(product) + pricePerProduct);
            }


            input = scanner.nextLine();
        }


         productsQuantity.forEach((k, v) -> System.out.println(k + "->" + v + "total HP")); 
         productsPrice.forEach((k, v) -> System.out.println(k + "->" + v + "price")); 
        
      
    }
}
