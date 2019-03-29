package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        Map<String, Integer> result = new HashMap<>();
        for (String key : collectionA) {
            Integer tempCount = result.get(key);
            result.put(key, (tempCount == null) ? 1 : tempCount + 1);
        }

        for (String key : object.get("value")) {
            Integer tempCount = result.get(key);
            if (tempCount != null) {
                int count = tempCount - tempCount / 3;
                result.put(key, count);
            }
        }

        return result;
    }
}
