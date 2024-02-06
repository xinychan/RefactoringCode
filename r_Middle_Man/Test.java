package r_Middle_Man;

/**
 * 中间人（Middle Man）
 */
public class Test {
    /**
     * 重构前：
     * 过度运用委托，某些类“不干实事”，其作用是仅作为中间人调用其他类的函数
     */
    class MiddleMan {
        public void test() {
            String data = new A().getData();
            System.out.println(data);
        }
    }

    class A {
        public String getData() {
            return getC().getData();
        }

        private B getB() {
            return new B();
        }

        private C getC() {
            return getB().getC();
        }
    }

    class B {
        public C getC() {
            return new C();
        }
    }

    class C {
        public String getData() {
            return "data";
        }
    }
}
