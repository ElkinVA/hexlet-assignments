package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> booksList, Map<String, String> where) {
        List<Map<String, String>> resultList = new ArrayList<>();
        int conter;
        boolean resFlag = true;
        for (Map<String, String> book : booksList) {
            conter = 0;
            resFlag = true;
            for (Entry<String, String> key : where.entrySet()) {
                if (book.containsValue(key.getValue())) {
                    conter++;
                    if (conter == 2) {
                        resultList.add(book);
                        resFlag = false;
                    }
                }
            }
        }
        if (!resFlag) {
            resultList.clear();
        }
        return resultList;
    }
}
//END


