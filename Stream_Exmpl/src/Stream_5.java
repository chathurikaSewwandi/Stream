import java.util.Arrays;
        import java.util.List;
        import java.util.stream.Collectors;
public class Stream_5 {
    public static void main(String[] args) {
        // List of names
        List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tina");

        // Transform the list of names to a list of name lengths
        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        // Print the list of name lengths
        System.out.println(nameLengths);
    }
}
//output: [4, 5, 4, 4]