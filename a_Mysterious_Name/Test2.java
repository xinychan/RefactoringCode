package a_Mysterious_Name;

import java.util.ArrayList;
import java.util.List;

/**
 * 神秘命名（Mysterious Name）
 */
public class Test2 {
    /**
     * 重构后：
     * 类名/函数名/变量名，顾名思义
     */
    public List<String> initStudents() {
        List<String> students = new ArrayList<>();
        students.add("Andy");
        students.add("Bob");
        students.add("Cindy");
        students.add("David");
        return students;
    }
}
