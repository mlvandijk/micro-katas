package streams;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;

/**
 * Created by Marit on 16-6-2017.
 */
public class Partitioning {
    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people){
        return people.stream().collect(partitioningBy(p -> p.age >= 18));
    }

}
