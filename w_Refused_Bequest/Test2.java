package w_Refused_Bequest;

/**
 * 被拒绝的遗赠（Refused Bequest）
 */
public class Test2 {
    /**
     * 重构后：
     * 父类中所有的成员和函数，都是所有子类所需要的；并且所有父类都是抽象的，不能直接实例化
     */
    abstract class BaseDevice {
        public void initCPU() {
            System.out.println("initCPU");
        }

        public void initMemory() {
            System.out.println("initMemory");
        }
    }

    class Pc extends BaseDevice {
        public void connectMouse() {
            System.out.println("connectMouse");
        }

        public void connectKeyboard() {
            System.out.println("connectKeyboard");
        }

        public void connectLCD() {
            System.out.println("connectLCD");
        }
    }

    class Tablet extends BaseDevice {
        public void initLCD() {
            System.out.println("initLCD");
        }
    }
}
