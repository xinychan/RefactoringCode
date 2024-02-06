package a_Mysterious_Name;

import java.util.ArrayList;
import java.util.List;

/**
 * 神秘命名（Mysterious Name）
 */
public class Test {
    /**
     * 重构前：
     * 类名/函数名/变量名，不能直观的看出表达的含义
     */
    public List<String> action() {
        List<String> list = new ArrayList<>();
        list.add("Andy");
        list.add("Bob");
        list.add("Cindy");
        list.add("David");
        return list;
    }
}
