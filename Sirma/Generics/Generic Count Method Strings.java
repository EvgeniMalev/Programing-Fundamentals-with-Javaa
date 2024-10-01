import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Box<T extends Comparable<T>> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public int compareTo(Box<T> other) {
        return this.value.compareTo(other.getValue());
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}

public class Main {

    public static <T extends Comparable<T>> int countGreaterThan(List<Box<T>> list, T element) {
        Box<T> elementBox = new Box<>(element);
        int count = 0;
        
        for (Box<T> box : list) {
            if (box.compareTo(elementBox) > 0) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Box<String>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String element = scanner.nextLine();
            list.add(new Box<>(element));
        }

        String comparisonElement = scanner.nextLine();

        int count = countGreaterThan(list, comparisonElement);
        System.out.println(count);
    }
}
