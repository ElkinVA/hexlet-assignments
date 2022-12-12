package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String getForwardedVariables(String conf) {
        return Stream.of(conf.split("\n"))
       .filter(n -> n.startsWith("environment"))
               .map(n -> n.replaceAll("environment=\"", ""))
               .map(n -> n.split(","))
               .flatMap(Arrays::stream).distinct()
               .filter(n -> n.startsWith("X_FORWARDED_"))
               .map(n -> n.replaceAll("X_FORWARDED_", ""))
               .map(n -> n.replaceAll("\"", ""))
               .collect(Collectors.joining(","));
    }
}
//END
