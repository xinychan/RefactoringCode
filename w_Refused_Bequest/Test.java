package w_Refused_Bequest;

/**
 * 被拒绝的遗赠（Refused Bequest）
 */
public class Test {
    /**
     * 重构前：
     * 子类继承父类所有的变量和函数，但只是使用其中一部分，拒绝使用其他部分
     */
    class BaseDevice {
        public void initCPU() {
            System.out.println("initCPU");
        }

        public void initMemory() {
            System.out.println("initMemory");
        }

        public void connectMouse() {
            System.out.println("connectMouse");
        }

        public void connectKeyboard() {
            System.out.println("connectKeyboard");
        }
    }

    class Pc extends BaseDevice {
        public void connectLCD() {
            System.out.println("connectLCD");
        }
    }

    // Tablet 不需要 connectMouse()/connectKeyboard()
    class Tablet extends BaseDevice {
        public void initLCD() {
            System.out.println("initLCD");
        }
    }
}
