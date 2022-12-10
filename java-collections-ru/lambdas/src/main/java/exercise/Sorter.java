package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> peoples) {
        return peoples.stream()
                .filter(name -> name.get("gender").equals("male"))
                .map(name -> name.get("age"))
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }
}

// END