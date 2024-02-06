package i_Feature_Envy;

/**
 * 依恋情结（Feature Envy）
 */
public class Test2 {
    /**
     * 重构后：
     * 代码分出区域，最大化区域内部的交互、最小化跨区域的交互
     */
    class PayCard {
        private User user;

        public PayCard(User user) {
            this.user = user;
        }

        public int getMoney() {
            return this.user.getMoney();
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

        public int getMoney() {
            if (this.type.equals("vip")) {
                return 10000;
            }
            return 5000;
        }
    }
}
