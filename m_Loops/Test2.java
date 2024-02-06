package m_Loops;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 循环语句（Loops）
 */
public class Test2 {
    /**
     * 重构后：
     * 使用管道取代循环
     * 管道操作（如filter和map）有利于更快地看清被处理的元素以及处理它们的动作
     */
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "banana");
        List<String> result = fruits.stream()
                .filter(fruit -> !"orange".equals(fruit))
                .collect(Collectors.toList());
        // "apple" "banana"
        result.forEach(System.out::println);
    }
}
