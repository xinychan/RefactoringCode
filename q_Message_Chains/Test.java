package q_Message_Chains;

/**
 * 过长的消息链（Message Chains）
 */
public class Test {
    /**
     * 重构前：
     * 向一个对象请求另一个对象，然后再向后者请求另一个对象；
     * 一旦对象间的关系发生任何变化，客户端就不得不做出相应修改；
     * 而且会产生过多的依赖，以及一长串临时变量；
     */
    class MessageChains {
        public void test() {
            String data = new A().getB().getC().getData();
            System.out.println(data);
        }
    }

    class A {
        public B getB() {
            return new B();
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
