package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String key : collection1) {
            if (key.contains("-")) {
                String[] list = key.split("-");
                result.put(list[0], Integer.parseInt(list[1]));
            } else {
                Integer count = result.get(key);
                result.put(key, (count == null) ? 1 : count + 1);
            }
        }

        return result;
    }
}
