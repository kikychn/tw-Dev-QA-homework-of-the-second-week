package cn.school.thoughtworks.section2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String key : collection1) {
            String specialChar1 = "-";
            String specialChar2 = ":";
            String specialChar3 = "[";
            if (key.contains(specialChar1) || key.contains(specialChar2) || key.contains(specialChar3)) {
                char[] list = key.toCharArray();
                String mapKey = String.valueOf(list[0]);
                String mapCount = "";
                for (int i = 2; i < list.length; i++) {
                    if (list[i] >= '0' && list[i] <= '9') {
                        mapCount += list[i];
                    }
                }
                Integer tempCount = Integer.valueOf(mapCount);
                Integer count = result.get(mapKey);
                result.put(mapKey, (count == null) ? tempCount : count + tempCount);
            } else {
                Integer count = result.get(key);
                result.put(key, (count == null) ? 1 : count + 1);
            }

        }

        return result;
    }
}
