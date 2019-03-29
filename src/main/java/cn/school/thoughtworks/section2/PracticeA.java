package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String key : collection1) {
            Integer count = result.get(key);
            result.put(key, (count == null) ? 1 : count + 1);
        }

        return result;
    }
}
