package streams;

import java.util.List;
import java.util.stream.Collectors;

public class Kids {
    public static List<String> getKidNames(List<Person> kids){
        return kids.stream().filter(k -> k.age < 18).map(k -> k.name).collect(Collectors.toList());
    }
}
