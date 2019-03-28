package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> result = new ArrayList<>();
        for (List<String> strs : collection2) {
            for (String s : collection1) {
                if (strs.contains(s)) {
                    result.add(s);
                }
            }
        }
        return result;
    }
}
