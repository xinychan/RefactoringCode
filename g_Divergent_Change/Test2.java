package g_Divergent_Change;

/**
 * 发散式变化（Divergent Change）
 */
public class Test2 {
    /**
     * 重构后：
     * 某处代码修改时，只需要关心一个上下文
     */
    public int mathCal(int num) {
        // 只依赖上下文传递过来的参数 num
        return add(num) + mul(add(num));
    }

    private int add(int num) {
        return num + 100;
    }

    private int mul(int num) {
        return num * 2;
    }
}
