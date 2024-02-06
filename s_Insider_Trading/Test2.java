package s_Insider_Trading;

/**
 * 内幕交易（Insider Trading）
 */
public class Test2 {
    /**
     * 重构后：
     * 如果两个模块有共同的逻辑，可以尝试新建一个模块，把共用的数据统一管理；
     * 或者用隐藏委托关系，把另一个模块变成两者的中介
     */
    class InsiderTrading {
        public void test() {
            Department department = new Department("001", "Andy");
            Person person = new Person("name", department);
            // 直接从 Person 中获取所在部门的 code 和 manager
            System.out.println(person.getName());
            System.out.println(person.getDepartmentCode());
            System.out.println(person.getDepartmentManager());
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

        public String getDepartmentCode() {
            return department.getCode();
        }

        public String getDepartmentManager() {
            return department.getManager();
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
