import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_6 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,1,4,7,10);
        Stream<Integer> numberStream = number.stream()
                .filter((Integer val)-> val >= 3)
                .peek((Integer val) -> System.out.println("After filter:" + val))
                .map((Integer val) -> (val * -1))
                .peek((Integer val) -> System.out.println("After negative:" + val))
                .sorted()
                .peek((Integer val) -> System.out.println("After Sorted:" + val));
        List<Integer>FilterNumber = numberStream.collect(Collectors.toList());
    }
}
