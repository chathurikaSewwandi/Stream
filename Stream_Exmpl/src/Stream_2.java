import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_2 {
    public static void main(String[] args) {
        /*
//From collection
        List<Integer> salaryL = Arrays.asList(2000,4000,15000,3000);
        Stream<Integer> streamList = salaryL.stream();
// from Array
        Integer [] salaryL = {2000,4000,15000,3000 } ;
        Stream<Integer>StreamArray = Arrays.stream(salaryL);

//from Static Method
        Stream<Integer> streamStatic  = Stream.of(2000,4000,15000,3000);
//from stream builder

        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(1500).add(3000).add(4500);

        Stream<Integer> streamBuilderStream = streamBuilder.build();
//from Stream iterate
        Stream<Integer> streamIterate = Stream.iterate(1500,(Integer n) -> n + 5000).limit(5);
*/
        List<Integer> salaryL = new ArrayList<>();
        salaryL.add(2000);
        salaryL.add(1500);
        salaryL.add(5000);
        salaryL.add(7000);

        Long output = salaryL.stream().
                filter((Integer sal) -> sal > 2000).count();
        System.out.println(output);
    }
}

