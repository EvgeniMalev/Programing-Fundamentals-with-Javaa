import java.util.ArrayList;

public class Jar<T> {
    private ArrayList<T> elements;

    public Jar() {
        elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public T remove() {
        if (elements.isEmpty()) {
            return null; 
        }
        return elements.remove(elements.size() - 1);
    }

    public static void main(String[] args) {
        Jar<Integer> jar = new Jar<>();
        jar.add(10);
        jar.add(20);
        System.out.println(jar.remove()); 
        System.out.println(jar.remove());

        Jar<String> stringJar = new Jar<>();
        stringJar.add("Hello");
        stringJar.add("World");
        System.out.println(stringJar.remove()); 
        System.out.println(stringJar.remove()); 
    }
}
