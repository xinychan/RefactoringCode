package c_Long_Function;

import java.util.ArrayList;
import java.util.List;

/**
 * 过长函数（Long Function）
 */
public class Test2 {

    /**
     * 重构后：
     * 函数更简短，易于阅读和理解
     */
    public void initData() {
        initStudents();
        initTeachers();
        initParents();
    }

    private void initStudents() {
        List<String> students = new ArrayList<>();
        students.add("Student1");
        students.add("Student2");
        students.add("Student3");
        students.add("Student4");
        students.add("Student5");
        students.add("Student6");
        students.add("Student7");
        students.add("Student8");
        students.add("Student9");
        students.add("Student10");
    }

    private void initTeachers() {
        List<String> teachers = new ArrayList<>();
        teachers.add("Teacher1");
        teachers.add("Teacher2");
        teachers.add("Teacher3");
        teachers.add("Teacher4");
        teachers.add("Teacher5");
        teachers.add("Teacher6");
        teachers.add("Teacher7");
        teachers.add("Teacher8");
        teachers.add("Teacher9");
        teachers.add("Teacher10");
    }

    private void initParents() {
        List<String> parents = new ArrayList<>();
        parents.add("Parent1");
        parents.add("Parent2");
        parents.add("Parent3");
        parents.add("Parent4");
        parents.add("Parent5");
        parents.add("Parent6");
        parents.add("Parent7");
        parents.add("Parent8");
        parents.add("Parent9");
        parents.add("Parent10");
    }
}
