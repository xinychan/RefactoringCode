package i_Feature_Envy;

/**
 * 依恋情结（Feature Envy）
 */
public class Test {
    /**
     * 重构前：
     * 一个函数跟另一个模块中的函数或者数据交流格外频繁，远胜于在自己所处模块内部的交流，这是依恋情结的典型情况
     */
    class PayCard {
        private User user;

        public PayCard(User user) {
            this.user = user;
        }

        public int getMoney() {
            // 依赖外部模块的内部数据
            if (this.user.getType().equals("vip")) {
                return 10000;
            }
            return 5000;
        }
    }

    class User {
        private String type;

        public User(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }
}
