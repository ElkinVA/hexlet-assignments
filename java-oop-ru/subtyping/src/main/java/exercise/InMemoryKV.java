package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {

    private Map<String, String> data = new HashMap<>();

    InMemoryKV(Map<String, String> initial) {
        data.putAll(initial);
    }

    public void set(String key, String value) {
        data.put(key, value);
    }

    public void unset(String key) {
        data.remove(key);
    }

    public String get(String key, String defaultValue) {
        return data.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        return new HashMap<>(data);
    }

/*
    private Map<String,String> db1;
    public InMemoryKV(Map<String,String> db1) {
        this.db1 = db1;
    }

    @Override
    public void set(String key, String value) {
        if (!db1.containsValue(key)) {
            db1.put(key, value);
        } else {
            db1.remove(value);
        }
    }

    @Override
    public void unset(String key) {
        db1.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        String result = "";
        if (db1.containsValue(key)) {
            result = db1.get(key);
        } else {
            result = defaultValue;
        }
        return result;
    }

    @Override
    public Map<String, String> toMap() {
        return db1;
    }*/
}
// END
