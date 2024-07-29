public class ArrayCreator {

    @SuppressWarnings("unchecked")
    public static <T> T[] create(int length, T item) {
        T[] array = (T[]) new Object[length];
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }

    public static <T> T[] create(Class<T> clazz, int length, T item) {
        T[] array = (T[]) java.lang.reflect.Array.newInstance(clazz, length);
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }

    public static void main(String[] args) {
        Integer[] integers = ArrayCreator.create(5, 10);
        String[] strings = ArrayCreator.create(String.class, 5, "Hello");
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
