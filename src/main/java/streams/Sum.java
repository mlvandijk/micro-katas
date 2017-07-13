package streams;

import java.util.List;

public class Sum {
    public static Integer calculate(List<Integer> numbers) {
        return numbers.stream().reduce(0, (total, number) -> total + number);
    }
}
