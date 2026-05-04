import java.util.LinkedList;

public class IT24038 {

    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("First color: " + colors.get(0));

        colors.remove("Green");

        System.out.println("Colors List: " + colors);
    }
}