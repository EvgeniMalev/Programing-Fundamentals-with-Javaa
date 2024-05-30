/**
The example shows a code that validates a data from String line
The task validates a name with a Pattern
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        while (!(input = scanner.nextLine()).equals("Last note")) {
            boolean validMessage = isValidMessage(input);
            if (validMessage) {
                String[] parts = input.split("=");
                String nameCode = parts[0];
                String code = parts[1];
                String name = decipherName(nameCode);
                String geohashcode = checkCode(code);
                if (!geohashcode.equals("Wrong code!")) {
                    System.out.printf("Coordinates found! %s -> %s%n", name, geohashcode);
                } else {
                    print();
                }
            } else {
                print();
            }
        }
        scanner.close();
    }

    private static boolean isValidMessage(String line) {
        Pattern pattern = Pattern.compile("[\\w!@#$?]+=[0-9]+<<\\w+");
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            return matcher.group().length() == line.length();
        }
        return false;
    }

    private static String decipherName(String nameCode) {
        return nameCode.replaceAll("[^a-zA-Z]", "");
    }

    private static String checkCode(String code) {
        String[] parts = code.split("<<");
        int codeLength = Integer.parseInt(parts[0]);
        String geohashcode = parts[1];
        if (codeLength == geohashcode.length()) {
            return geohashcode;
        } else {
            return "Wrong code!";
        }
    }

    private static void print() {
        System.out.println("Nothing found!");
    }
}
