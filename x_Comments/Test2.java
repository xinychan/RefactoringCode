package x_Comments;

/**
 * 注释（Comments）
 */
public class Test2 {
    /**
     * 重构后：
     * 通过变量和函数名命名规范，以及简化函数逻辑，使代码具备自注释能力；只添加必要的注释；
     */
    class MathCalc {
        public int calc(int a, int b) {
            int sum = addCalc(a, b);
            int diff = minusCalc(a, b);
            return addCalc(sum, diff);
        }

        private int addCalc(int a, int b) {
            return a + b;
        }

        private int minusCalc(int a, int b) {
            return a - b;
        }
    }
}
