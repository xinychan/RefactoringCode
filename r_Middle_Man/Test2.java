package r_Middle_Man;

/**
 * 中间人（Middle Man）
 */
public class Test2 {
    /**
     * 重构后：
     * 移除中间人，直接和真正负责的对象打交道
     */
    class MiddleMan {
        public void test() {
            String data = new C().getData();
            System.out.println(data);
        }
    }

    class C {
        public String getData() {
            return "data";
        }
    }
}
