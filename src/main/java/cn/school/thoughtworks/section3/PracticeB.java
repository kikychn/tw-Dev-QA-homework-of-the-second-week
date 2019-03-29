package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {
        Map<String, Integer> result = collectionA;
        for (String key : object.get("value")) {
            Integer tempCount = collectionA.get(key);
            if (tempCount != null) {
                int count = tempCount - tempCount / 3;
                result.put(key, count);
            }
        }

        return result;
    }
}
