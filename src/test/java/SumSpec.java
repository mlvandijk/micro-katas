import org.junit.Test;

import java.util.List;

import static streams.Sum.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class SumSpec {
    @Test
    public void sumNumber() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertThat(calculate(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }


}
