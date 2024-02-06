package o_Speculative_Generality;

/**
 * 夸夸其谈通用性（Speculative Generality）
 */
public class Test {
    /**
     * 重构前：
     * 函数的某些参数未被使用或并非必要，或者函数本身未被使用或并非必要，甚至类未被使用或并非必要
     * 造成系统更难理解和维护
     */
    class SpeculativeGenerality {
        public void test() {
            Student student = new Student("Andy", "001");
            StudentManager manager = new StudentManager(student);
            System.out.println(manager.getName());
            System.out.println(manager.getId());
            System.out.println(manager.getInfo());
        }
    }

    class Student {
        private String name;
        private String id;

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

        public String getInfo() {
            return name + ":" + id;
        }
    }

    // StudentManager 当前用于管理学生信息，未来可能还要扩展更多管理能力
    class StudentManager {
        private Student student;

        public StudentManager(Student student) {
            this.student = student;
        }

        public String getName() {
            return this.student.getName();
        }

        public String getId() {
            return this.student.getId();
        }

        public String getInfo() {
            return this.student.getInfo();
        }
    }
}
