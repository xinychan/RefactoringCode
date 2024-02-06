package t_Large_Class;

/**
 * 过大的类（Large Class）
 */
public class Test {
    /**
     * 重构前：
     * 单个类做太多事情，字段/函数太多，复杂度高
     */
    class LargeClass {
        public void funcPhone() {
            System.out.println("funcPhone");
        }

        public void funcPc() {
            System.out.println("funcPc");
        }

        public void funcTv() {
            System.out.println("funcTv");
        }
    }
}
