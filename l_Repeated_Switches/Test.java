package l_Repeated_Switches;

/**
 * 重复的switch （Repeated Switches）
 */
public class Test {
    /**
     * 重构前：
     * 在不同的地方使用同样的switch语句，或者if/else语句
     * 每当需要增加一个选择分支时，必须找到所有的switch，并逐一更新
     * 并且修改一个条件逻辑时，容易影响到其他条件
     */
    class Price {
        // ￥100/$100/€100
        private String value;

        public Price(String value) {
            this.value = value;
        }

        private String getUnit() {
            return value.substring(0, 1);
        }

        private int getCount() {
            return Integer.parseInt(value.substring(1));
        }

        public String priceUnit() {
            switch (getUnit()) {
                case "￥":
                    return "人民币";
                case "$":
                    return "美元";
                case "€":
                    return "欧元";
                default:
                    return "";
            }
        }

        public int priceCnyCount() {
            switch (getUnit()) {
                case "￥":
                    return getCount();
                case "$":
                    return getCount() * 7;
                case "€":
                    return getCount() * 8;
                default:
                    return 0;
            }
        }
    }
}
