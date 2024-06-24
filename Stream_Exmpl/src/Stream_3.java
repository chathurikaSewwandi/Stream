
import java.util.Arrays;
        import java.util.List;
        import java.util.stream.Collectors;

public class Stream_3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter even numbers and collect them into a list
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        //output : [2, 4, 6, 8, 10]


        // Print the list of even numbers
        System.out.println(evenNumbers);
    }
}
