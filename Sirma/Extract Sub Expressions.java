import java.util.Scanner;
import java.util.Stack;

public class ExtractSubExpressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        
        extractSubExpressions(expression);
    }
    
    public static void extractSubExpressions(String expression) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    int startIndex = stack.pop();
                    String subExpression = expression.substring(startIndex + 1, i);
                    System.out.println(subExpression);
                }
            }
        }
    }
}
