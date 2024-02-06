package d_Long_Parameter_List;

/**
 * 过长参数列表（Long Parameter List）
 */
public class Test2 {

    class Person {
        public String name;
        public int id;
        public int age;
        public int height;
        public int weight;
    }

    /**
     * 重构后：
     * 有效地缩短参数列表
     */
    public void record(Person person) {
        System.out.println(person.name);
        System.out.println(person.id);
        System.out.println(person.age);
        System.out.println(person.height);
        System.out.println(person.weight);
    }

}
