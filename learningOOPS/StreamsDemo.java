package learningOOPS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        // streams --> Assembly line / pipeline

        List<String> names = Arrays.asList("Ved","alya","shraddha");
        for (String string : names) {
            System.out.println(string);
        }

        // using streams
        Stream<String> stream = names.stream();
        stream.forEach((name) -> System.out.println(name));

        Stream<String> filteredstream =  stream.filter(naam -> naam.startsWith("a"));
        filteredstream.forEach((name) -> System.out.println(name));
    }
}
