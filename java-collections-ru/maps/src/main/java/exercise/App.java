package exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// BEGIN
class App {

    public static Map<String, Integer> getWordCount(String text) {
        Map<String, Integer> wordsMap = new HashMap<>();
        String[] wordArray = text.split(" ");
        if (text.equals("")) {
            return wordsMap;
        }
            for (String word:
                 wordArray) {
                    if (wordsMap.containsKey(word)) {
                        wordsMap.put(word, wordsMap.get(word) + 1);
                    } else {
                        wordsMap.put(word, 1);
                    }
                }
        return wordsMap;
    }

   public static String toString(Map<String, Integer> wordsMap) {
       Set<String> keys = wordsMap.keySet();
       if (wordsMap.isEmpty()) {
           return "{}";
       }
       String result = "{\n";
       for (String key : keys) {
           result = result + "  " + key + ": " + wordsMap.get(key) + "\n";
       }
     result = result + "}";
       return result;
    }
}
//END
