public class Scale<T extends Comparable<T>> {
    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier() {
        int comparison = left.compareTo(right);
        if (comparison > 0) {
            return left; 
        } else if (comparison < 0) {
            return right; 
        } else {
            return null; 
        }
    }

   
    public static void main(String[] args) {
        
        Scale<Integer> intScale = new Scale<>(3, 4);
        System.out.println("Heavier element: " + intScale.getHeavier()); 

    
        Scale<String> stringScale = new Scale<>("apple", "banana");
        System.out.println("Heavier element: " + stringScale.getHeavier()); 

 
        Scale<Integer> equalScale = new Scale<>(5, 5);
        System.out.println("Heavier element: " + equalScale.getHeavier()); 
    }
}
