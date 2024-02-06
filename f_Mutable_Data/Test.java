package f_Mutable_Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 可变数据（Mutable Data）
 */
public class Test {

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
     * 重构前：
     * 对数据的修改经常导致出乎意料的结果和难以发现的bug
     */
    public List<Integer> updateList() {
        // 直接修改源数据，使用源数据的地方也会受影响
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        return list;
    }

    // 初始化默认数据被修改
    public void useInitList() {
        System.out.println(list.size());
    }

}
