package e_Global_Data;

/**
 * 全局数据（Global Data）
 */
public class Test2 {

    // 假设这是全局都可以访问到的数据
    class AuthInfo {
        private String platform = "PC";
        private String token;

        public void setToken(String token) {
            this.token = token;
        }

        @Override
        public String toString() {
            return "platform='" + platform + ", token='" + token;
        }
    }

    public AuthInfo info = new AuthInfo();

    /**
     * 重构后：
     * 全局数据只有指定的模块或函数可以修改
     */
    public void requestToken(String token) {
        info.setToken(token);
    }

    public void receiveContent(String content) {
        info.setToken(content + "PC");
    }

    public void useAuthInfo() {
        System.out.println(info.toString());
    }

}
