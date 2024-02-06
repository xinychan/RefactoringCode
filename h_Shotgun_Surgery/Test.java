package h_Shotgun_Surgery;

import java.util.ArrayList;
import java.util.List;

/**
 * 霰弹式修改（Shotgun Surgery）
 */
public class Test {
    /**
     * 重构前：
     * 某业务逻辑发生变化，需要修改多处代码
     */
    public List<String> getClassroomA() {
        List<String> list = new ArrayList<>();
        // 不同班级的老师相同，老师变化需要所有班级都修改
        list.add("teacher-Math");
        list.add("teacher-Chinese");
        // 不同班级的学生不同
        list.add("student-A1");
        list.add("student-A2");
        list.add("student-A3");
        return list;
    }

    public List<String> getClassroomB() {
        List<String> list = new ArrayList<>();
        list.add("teacher-Math");
        list.add("teacher-Chinese");
        list.add("student-B1");
        list.add("student-B2");
        list.add("student-B3");
        return list;
    }
}
