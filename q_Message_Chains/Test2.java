package q_Message_Chains;

/**
 * 过长的消息链（Message Chains）
 */
public class Test2 {
    /**
     * 重构后：
     * 隐藏委托关系，服务端直接提供客户端需要的函数
     */
    class MessageChains {
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
