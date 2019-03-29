package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String, List<String>> collection2) {
        List<String> result = new ArrayList<>();
        for (String s : collection1) {
            for (String s1 : collection2.get("value")) {
                if (s == s1) {
                    result.add(s);
                    break;
                }
            }
        }
        return result;
    }
}
