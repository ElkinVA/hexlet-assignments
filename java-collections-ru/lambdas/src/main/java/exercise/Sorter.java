package exercise;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class Sorter{
    public static List<String> takeOldestMans(List<Map<String, String>> peoples) {
        return peoples.stream()
                .filter(name -> name.get("gender").equals("male"))
       //         .map(name -> name)
                .sorted(Comparator.comparing((name -> LocalDate.parse(name.get("birthday")))))
                .map(name -> name.get(name))
                .collect(Collectors.toList());
    }
}

// END
