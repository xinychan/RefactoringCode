package v_Data_Class;

import java.util.ArrayList;
import java.util.List;

/**
 * 纯数据类（Data Class）
 */
public class Test2 {
    /**
     * 重构后：
     * 将特定数据的操作集中在一个地方，提高代码的可读性/可维护性/可扩展性
     */
    class Student {
        private String name;
        private String id;
        private List<String> lessonList = new ArrayList<>();

        // 不需要设值的属性删除set方法，提供构造方法
        public Student(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public List<String> getLessonList() {
            return lessonList;
        }

        // 集合属性删除设值函数，并提供add/delete方法
        public void addLesson(List<String> lessonList) {
            this.lessonList.addAll(lessonList);
        }
    }
}
