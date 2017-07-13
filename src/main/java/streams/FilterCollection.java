package streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilterCollection {
    // java 7
//    public static List<String> transform(List<String> collection){
//
//    }

    // java 8
    public static List<String> transform(List<String> collection){
        return collection.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
    }
}
