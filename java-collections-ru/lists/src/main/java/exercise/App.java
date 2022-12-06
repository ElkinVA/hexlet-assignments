package exercise;

import java.util.Arrays;
import java.util.ArrayList;

// BEGIN
class App {
    public static boolean scrabble(String letters, String word) {
        letters = letters.toLowerCase();
        word = word.toLowerCase();
        ArrayList<String> lettersList = new ArrayList<String>(Arrays.asList(letters.split("")));
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(word.split("")));

        if (wordList.size() == 0 || word.length() > letters.length()) {
            return false;
        }

        for (var counter = 0; counter < word.length(); counter++) {
            var resWord = word.substring(counter, counter + 1);
            if (lettersList.contains(resWord)) {
                lettersList.remove(resWord);
            } else {
                return false;
            }
        }
        return true;
    }
}
  //END
