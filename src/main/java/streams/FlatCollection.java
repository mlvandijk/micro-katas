package streams;

import java.util.List;
import java.util.stream.Collectors;

public class FlatCollection {


    // java 8
    public static List<String> transform(List<List<String>> collection){
        return collection.stream().flatMap(value -> value.stream()).collect(Collectors.toList());
    }
}
