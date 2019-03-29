package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String key : collection1) {
            String specialChar = "-";
            if (key.contains(specialChar)) {
                char[] list = key.toCharArray();
                String mapKey = String.valueOf(list[0]);
                String mapCount = "";
                for (int i = 2; i < list.length; i++) {
//                    try {
//                        Integer tempCount = Integer.parseInt(String.valueOf(list[i]));
//                        if (tempCount >= 0 && tempCount <= 9) {
//                            mapCount += list[i];
//                        }
//                    } catch (NumberFormatException e) {
//                        break;
//                    }
                    if (list[i]>='0' && list[i]<='9') {
                        mapCount += list[i];
                    }
                }
                result.put(mapKey, Integer.valueOf(mapCount));
            } else {
                Integer count = result.get(key);
                result.put(key, (count == null) ? 1 : count + 1);
            }
        }

        return result;
    }
}
