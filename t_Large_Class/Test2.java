package t_Large_Class;

/**
 * 过大的类（Large Class）
 */
public class Test2 {
    /**
     * 重构后：
     * 按单一职责，拆分类
     */
    class Phone {
        public void funcPhone() {
            System.out.println("funcPhone");
        }
    }

    class Pc {
        public void funcPc() {
            System.out.println("funcPc");
        }
    }

    class Tv {
        public void funcTv() {
            System.out.println("funcTv");
        }
    }
}
