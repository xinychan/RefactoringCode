package v_Data_Class;

import java.util.List;

/**
 * 纯数据类（Data Class）
 */
public class Test {
    /**
     * 重构前：
     * Data Class 它们拥有一些字段，以及用于访问这些字段的函数，除此之外一无长物
     * 注意：并非所有纯稚的数据类都需要重构，先分析其被调用点的行为特点
     */
    class Student {
        private String name;
        private String id;
        private List<String> lessonList;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<String> getLessonList() {
            return lessonList;
        }

        public void setLessonList(List<String> lessonList) {
            this.lessonList = lessonList;
        }
    }
}
