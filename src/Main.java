
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
                String input = "1, 2, 3, 4, 4, 5";
                String[] numbers = input.split(", ");
                Set<String> set = new HashSet<>(Arrays.asList(numbers));
                System.out.println(set.toString());
    }
}