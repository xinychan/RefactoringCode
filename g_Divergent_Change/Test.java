package g_Divergent_Change;

/**
 * 发散式变化（Divergent Change）
 */
public class Test {
    /**
     * 重构前：
     * 某处代码经常因为不同的原因在不同的方向上发生变化，会关联多个上下文
     */
    public int mathCal(int num) {
        int addRes = num + 100; // 计算 addRes 依赖上下文传递过来的参数 num
        int mulRes = addRes * 2; // 计算 mulRes 依赖上下文变量 addRes
        return addRes + mulRes; // 计算 结果 依赖上下文变量 addRes 和 mulRes
    }
}
