package streams;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

/**
 * Created by Marit on 16-6-2017.
 */
public class Grouping {
    public static Map<String, List<Person>> groupByNationality(List<Person> people){
        return people.stream().collect(groupingBy(Person::getNationality));
    }
}
