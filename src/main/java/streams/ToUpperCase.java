package streams;

import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {

    // java 7
//    public static List<String> transform(List<String> collection) {
//        List<String> upper = new ArrayList<>();
//        for (String s: collection){
//            upper.add(s.toUpperCase());
//        }
//        return upper;
//    }

    // java 8
        public static List<String> transform(List<String> collection) {
        return collection.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }

    // java 8 alternative
//    public static List<String> transform(List<String> collection) {
//        Function<String, String> toUpper = (s) -> s.toUpperCase();
//        return collection.stream().map(toUpper).collect(Collectors.toList());
//    }
}
