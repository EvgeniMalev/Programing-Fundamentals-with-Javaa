import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

   
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
		
		HashMap<String, Integer> italiancarMap = new HashMap<>();

         italiancarMap.put("Fiat 500", 20);
		 italiancarMap.put("Fiat 600", 18);
		 italiancarMap.put("Fiat 850", 42);
		 italiancarMap.put("Fiat 1100", 50);
		 italiancarMap.put("Alfa Romeo 156", 85);
		 
		 
		 italiancarMap.remove("Fiat 850", 42);
		
		for( Map.Entry<String, Integer> entry : italiancarMap.entrySet()) {
		 System.out.println( entry.getKey() + " with " + entry.getValue() + " hp");
		    }
		}
