package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {
        Map<String, Integer> result = collectionA;
        for (String key : object.get("value")) {
            Integer count = collectionA.get(key);
            if (count != null) {
                result.put(key, count - 1);
            }
        }

        return result;
    }
}
