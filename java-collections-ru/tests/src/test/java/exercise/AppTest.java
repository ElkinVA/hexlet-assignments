package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> takeTake = App.take(numbers, 2);
        List<Integer> verifList = new ArrayList<>(Arrays.asList(1, 2));
        assertThat(takeTake).isEqualTo(verifList);

        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(0));
        List<Integer> takeTake1 = App.take(numbers1, 2);
        List<Integer> verifList1 = new ArrayList<>(Arrays.asList(0));
        assertThat(takeTake1).isEqualTo(verifList1);

        List<Integer> numbers2 = new ArrayList<>(Arrays.asList());
        List<Integer> takeTake2 = App.take(numbers2, 10);
        List<Integer> verifList2 = new ArrayList<>(Arrays.asList());
        assertThat(takeTake2).isEqualTo(verifList2);

        List<Integer> numbers3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> takeTake3 = App.take(numbers3, -1);
        List<Integer> verifList3 = new ArrayList<>(Arrays.asList());
        assertThat(takeTake3).isEqualTo(verifList3);

        List<Integer> numbers4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> takeTake4 = App.take(numbers4, 0);
        List<Integer> verifList4 = new ArrayList<>(Arrays.asList());
        assertThat(takeTake4).isEqualTo(verifList4);
        // END
    }
}
