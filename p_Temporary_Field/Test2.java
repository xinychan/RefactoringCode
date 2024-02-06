package p_Temporary_Field;

/**
 * 临时字段（Temporary Field）
 */
public class Test2 {
    /**
     * 重构后：
     * 特定情况改为通用情况，减少条件式代码，易于理解
     */
    class TemporaryField {
        private Student student;

        public void setStudent(Student student) {
            if ("".equals(this.student.getName()) || "".equals(this.student.getId())) {
                this.student = new UnknownStudent();
                return;
            }
            this.student = student;
        }

        public String getStudentName() {
            return this.student.getName();
        }

        public String getStudentId() {
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

    class UnknownStudent extends Student {
        @Override
        public String getName() {
            return "unknown";
        }

        @Override
        public String getId() {
            return "unknown";
        }
    }
}
