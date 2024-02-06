package h_Shotgun_Surgery;

import java.util.ArrayList;
import java.util.List;

/**
 * 霰弹式修改（Shotgun Surgery）
 */
public class Test2 {
    /**
     * 重构后：
     * 某业务逻辑发生变化，只需要修改一处代码
     */
    public List<String> getClassroomA() {
        List<String> list = new ArrayList<>();
        addTeacher(list);
        addStudentA(list);
        return list;
    }

    public List<String> getClassroomB() {
        List<String> list = new ArrayList<>();
        addTeacher(list);
        addStudentB(list);
        return list;
    }

    // 不同班级的老师相同，老师变化只需要修改这一处
    private void addTeacher(List<String> list) {
        list.add("teacher-Math");
        list.add("teacher-Chinese");
    }

    private void addStudentA(List<String> list) {
        list.add("student-A1");
        list.add("student-A2");
        list.add("student-A3");
    }

    private void addStudentB(List<String> list) {
        list.add("student-B1");
        list.add("student-B2");
        list.add("student-B3");
    }
}
