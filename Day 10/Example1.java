import java.util.TreeSet;

public class Example1 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Mango");
        set.add("Apple");

        for (String item : set) {
            System.out.println(item);
        }
    }
}