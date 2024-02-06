package x_Comments;

/**
 * 注释（Comments）
 */
public class Test {
    /**
     * 重构前：
     * 注释冗余，代码无法解释清楚的逻辑，尝试使用注释来解释
     */
    class MathCalc {
        public int calc(int a, int b) {
            int temp = a + b; // 先求和
            int temp2 = a - b; // 再求差
            int result = temp + temp2; // 再对【求和结果】和【求差结果】进行求和
            return result;
        }
    }
}
