package n_Lazy_Element;

import java.util.ArrayList;
import java.util.List;

/**
 * 冗赘的元素（Lazy Element）
 */
public class Test2 {
    /**
     * 重构后：
     * 使用内联函数或是内联类，简化代码结构
     */
    class ClassRoomTest {
        public List<String> test() {
            ClassRoom classRoom = new ClassRoom();
            // 内联函数方式
            return classRoom.getStudents();
        }

        public List<String> test2() {
            // 内联类方式
            List<String> list = new ArrayList<>();
            list.add("StudentA");
            list.add("StudentB");
            list.add("StudentC");
            return list;
        }
    }

    class ClassRoom {
        // 内联函数方式
        public List<String> getStudents() {
            List<String> list = new ArrayList<>();
            list.add("StudentA");
            list.add("StudentB");
            list.add("StudentC");
            return list;
        }
    }
}
