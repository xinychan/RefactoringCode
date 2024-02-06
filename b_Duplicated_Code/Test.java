package b_Duplicated_Code;

import java.util.List;
import java.util.Set;

/**
 * 重复代码（Duplicated Code）
 */
public class Test {

    /**
     * 重构前：
     * 不同的地方有相同的代码结构
     * 如果要修改重复代码，必须找出所有的副本来修改
     */
    public void initList(List<String> list) {
        list.add("list-a");
        list.add("list-b");
        list.add("list-c");
        // 相同业务逻辑
        System.out.println("init");
        System.out.println("a-b-c");
        System.out.println("finish");
    }

    public void initSet(Set<String> set) {
        set.add("set-a");
        set.add("set-b");
        set.add("set-c");
        // 相同业务逻辑
        System.out.println("init");
        System.out.println("a-b-c");
        System.out.println("finish");
    }

}
