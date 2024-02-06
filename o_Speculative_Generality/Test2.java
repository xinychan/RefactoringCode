package o_Speculative_Generality;

/**
 * 夸夸其谈通用性（Speculative Generality）
 */
public class Test2 {
    /**
     * 重构后：
     * 所有代码都会用到，所有函数和类都是必要的
     */
    class SpeculativeGenerality {
        public void test() {
            Student student = new Student("Andy", "001");
            System.out.println(student.getName());
            System.out.println(student.getId());
            System.out.println(student.getInfo());
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
}
