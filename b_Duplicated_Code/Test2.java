package b_Duplicated_Code;

import java.util.List;
import java.util.Set;

/**
 * 重复代码（Duplicated Code）
 */
public class Test2 {

    /**
     * 重构后：
     * 相同的代码结构只出现一次
     * 修改一处地方，其余地方也同步修改
     */
    public void initList(List<String> list) {
        list.add("list-a");
        list.add("list-b");
        list.add("list-c");
        printInfo();
    }

    public void initSet(Set<String> set) {
        set.add("set-a");
        set.add("set-b");
        set.add("set-c");
        printInfo();
    }

    // 抽取公共函数
    private void printInfo() {
        System.out.println("init");
        System.out.println("a-b-c");
        System.out.println("finish");
    }

}
