import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;

    public Main(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public V setValue(V value) {
        V oldValue = this.value;
        this.value = value;
        return oldValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main<?, ?> that = (Main<?, ?>) o;
        return Objects.equals(key, that.key) && Objects.equals(value, that.value);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter key for entry1: ");
        String key1 = scanner.nextLine();
        System.out.print("Enter value for entry1: ");
        Integer value1 = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Enter key for entry2: ");
        String key2 = scanner.nextLine();
        System.out.print("Enter value for entry2: ");
        Integer value2 = scanner.nextInt();
        scanner.nextLine();  

        Main<String, Integer> entry1 = new Main<>(key1, value1);
        Main<String, Integer> entry2 = new Main<>(key2, value2);

        System.out.println("Key of entry1: " + entry1.getKey());

        System.out.println("Value of entry1: " + entry1.getValue());

        System.out.println("HashCode of entry1: " + entry1.hashCode());

        System.out.print("Enter new value for entry1: ");
        Integer newValue1 = scanner.nextInt();
        scanner.nextLine();  
        entry1.setValue(newValue1);
        System.out.println("Updated Value of entry1: " + entry1.getValue());

        System.out.println("entry1 equals entry2: " + entry1.equals(entry2));

        scanner.close();
    }
}
