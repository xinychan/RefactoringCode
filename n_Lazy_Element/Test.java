package n_Lazy_Element;

import java.util.ArrayList;
import java.util.List;

/**
 * 冗赘的元素（Lazy Element）
 */
public class Test {
    /**
     * 重构前：
     * 类或者函数结构冗余，不需要这一层结构更简单
     */
    class ClassRoomTest {
        public List<String> test() {
            ClassRoom classRoom = new ClassRoom();
            return classRoom.getStudents();
        }
    }

    class ClassRoom {
        public List<String> getStudents() {
            List<String> list = new ArrayList<>();
            addStudent(list);
            return list;
        }

        private void addStudent(List<String> list) {
            list.add("StudentA");
            list.add("StudentB");
            list.add("StudentC");
        }
    }
}
