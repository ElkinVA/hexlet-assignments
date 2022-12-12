package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> prevous, Map<String, Object> next) {
        LinkedHashMap<String, String> result = new LinkedHashMap<String, String>();
        boolean flag1;
        for (Map.Entry<String, Object> pr : prevous.entrySet()) {
            flag1 = true;
            for (Map.Entry<String, Object> nx : next.entrySet()) {
                System.out.println("pr: " + pr + "    nx: " + nx);
                if (pr.getKey().equals(nx.getKey())) {
                    flag1 = false;
                    if (pr.getValue().equals(nx.getValue())) {
                        result.put(nx.getKey(), "unchanged");
                    } else {
                        result.put(nx.getKey(), "changed");
                    }
                }
            }
            if (flag1) {
                result.put(pr.getKey(), "deleted");
            }
        }
                for (Map.Entry<String, Object> nx1 : next.entrySet()) {
                    boolean flag = true;
                    for (Map.Entry<String, Object> pr1 : prevous.entrySet()) {
                        System.out.println("pr: " + pr1 + "    nx: " + nx1);
                        if (pr1.getKey().equals(nx1.getKey())) {
                            flag = false;
                        }
                    }
                    if (flag) {
                        result.put(nx1.getKey(), "added");
                    }
                }
        return result;
    }
}
//END
