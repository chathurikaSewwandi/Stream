import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Stream_4 {
    public static void main(String[] args) {
        // Nested list
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4)
        );

        // Flatten the nested list
        List<Integer> flatList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        // Print the flattened list
        System.out.println(flatList);
    }
}

//output : [1, 2, 3, 4]