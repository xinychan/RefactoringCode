package p_Temporary_Field;

/**
 * 临时字段（Temporary Field）
 */
public class Test {
    /**
     * 重构前：
     * 某个字段仅为某种特定情况而设，这样的代码让人不易理解
     */
    class TemporaryField {
        private Student student;

        public void setStudent(Student student) {
            this.student = student;
        }

        public String getStudentName() {
            // 多个地方都要对特定情况做处理
            if ("".equals(this.student.getName()) || "".equals(this.student.getId())) {
                return "unknown";
            }
            return this.student.getName();
        }

        public String getStudentId() {
            if ("".equals(this.student.getName()) || "".equals(this.student.getId())) {
                return "unknown";
            }
            return this.student.getId();
        }
    }

    class Student {
        private String name;
        private String id;

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
    }
}
