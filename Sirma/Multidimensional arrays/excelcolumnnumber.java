import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String columnName = scanner.nextLine();

        int columnNumber = excelColumnToNumber(columnName);
        System.out.println("Column number: " + columnNumber);
    }

    public static int excelColumnToNumber(String columnName) {
        int result = 0;
        for (int i = 0; i < columnName.length(); i++) {
            result = result * 26 + (columnName.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
