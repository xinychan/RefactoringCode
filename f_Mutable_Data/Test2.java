package f_Mutable_Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 可变数据（Mutable Data）
 */
public class Test2 {

    private List<Integer> list = new ArrayList<>();

    // 假设这是初始化默认数据
    private void initList() {
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
    }

    /**
     * 重构后：
     * 要更新一个数据结构，就返回一份新的数据副本，旧的数据仍保持不变
     */
    public List<Integer> updateList() {
        // 不修改源数据，使用源数据的地方不会受影响
        List<Integer> result = new ArrayList<>(list);
        result.add(2);
        result.add(4);
        result.add(6);
        result.add(8);
        return result;
    }

    // 初始化默认数据保持不变
    public void useInitList() {
        System.out.println(list.size());
    }

}
