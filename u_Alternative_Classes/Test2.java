package u_Alternative_Classes;

/**
 * 异曲同工的类（Alternative Classes with Different Interfaces）
 */
public class Test2 {
    /**
     * 重构后：
     * 抽取相同的字段和逻辑，消除重复行为
     */
    class BaseDevice {
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
