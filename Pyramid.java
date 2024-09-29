import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int rows = 5;

      for (int i = rows; i > 0; i--) {
          for (int j = 0; j <= rows; j++) {
              if (j >= i) {
                  System.out.print("*");
              } else {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
   }
}
