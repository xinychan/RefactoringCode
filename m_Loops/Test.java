package m_Loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 循环语句（Loops）
 */
public class Test {
    /**
     * 重构前：
     * 通过循环语句逐个操作数据，不利于快速理解代码
     */
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "banana");
        List<String> result = getFilterFruits(fruits, "orange");
        for (String name : result) {
            // "apple" "banana"
            System.out.println(name);
        }
    }

    private static List<String> getFilterFruits(List<String> fruits, String filter) {
        List<String> result = new ArrayList<>();
        for (String fruit : fruits) {
            if (!filter.equals(fruit)) {
                result.add(fruit);
            }
        }
        return result;
    }
}
