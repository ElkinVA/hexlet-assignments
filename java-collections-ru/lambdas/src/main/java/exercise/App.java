package exercise;

import java.util.Arrays;

// BEGIN
class App {

    public static String[][] enlargeArrayImage(String[][] myArray2) {
        return Arrays.stream(myArray2)
                .flatMap(Arrays::stream)
                .map(item -> new String[] {item, item})
                .flatMap(Arrays::stream)
                .map(item -> new String[] {item, item})
                .toArray(String[][]::new);
    }

}
// END
