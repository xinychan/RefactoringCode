package d_Long_Parameter_List;

/**
 * 过长参数列表（Long Parameter List）
 */
public class Test {

    /**
     * 重构前：
     * 函数参数列表过长，且零散
     */
    public void record(String name, int id, int age, int height, int weight) {
        System.out.println(name);
        System.out.println(id);
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
    }

}
