package streams;

import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 * Created by Marit on 16-6-2017.
 */
public class Joining {
    public static String namesToString(List<Person> people){
        return people.stream().map(Person::getName).collect(joining(", ", "Names: ", "."));
    }
}
