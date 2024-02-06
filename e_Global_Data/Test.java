package e_Global_Data;

/**
 * 全局数据（Global Data）
 */
public class Test {

    // 假设这是全局都可以访问到的数据
    class AuthInfo {
        public String platform = "PC";
        public String token;

        @Override
        public String toString() {
            return "platform='" + platform + ", token='" + token;
        }
    }

    public AuthInfo info = new AuthInfo();

    /**
     * 重构前：
     * 全局数据可以从代码库的任何一个角落都可以修改它，而且没有任何机制可以探测出到底哪段代码做出了修改
     */
    public void requestToken(String token) {
        info.token = token;
    }

    public void receiveContent(String content) {
        info.token = content + "PC";
    }

    public void useAuthInfo() {
        System.out.println(info.toString());
    }

}
