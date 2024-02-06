package s_Insider_Trading;

/**
 * 内幕交易（Insider Trading）
 */
public class Test {
    /**
     * 重构前：
     * 模块之前存在较多的数据交换，增加模块间的耦合
     */
    class InsiderTrading {
        public void test() {
            Department department = new Department("001", "Andy");
            Person person = new Person("name", department);
            // 要从 Person 中获取 Department，才能知道 Person 所在部门的 code 和 manager
            System.out.println(person.getName());
            System.out.println(person.getDepartment().getCode());
            System.out.println(person.getDepartment().getManager());
        }
    }

    class Person {
        private String name;
        private Department department;

        public Person(String name, Department department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public Department getDepartment() {
            return department;
        }
    }

    class Department {
        private String code;
        private String manager;

        public Department(String code, String manager) {
            this.code = code;
            this.manager = manager;
        }

        public String getCode() {
            return code;
        }

        public String getManager() {
            return manager;
        }
    }
}
