package u_Alternative_Classes;

/**
 * 异曲同工的类（Alternative Classes with Different Interfaces）
 */
public class Test {
    /**
     * 重构前：
     * 两个类中，有相同的字段或者函数逻辑，做的事情是类似的
     */
    class Pc {
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

        public void connectLCD() {
            System.out.println("connectLCD");
        }
    }

    class Tablet {
        public void initCPU() {
            System.out.println("initCPU");
        }

        public void initMemory() {
            System.out.println("initMemory");
        }

        public void initLCD() {
            System.out.println("initLCD");
        }
    }
}
