package k_Primitive_Obsession;

/**
 * 基本类型偏执（Primitive Obsession）
 */
public class Test {
    /**
     * 重构前：
     * 直接使用基本类型做复杂操作
     */
    class Phone {
        private String name;
        // ￥100/$100/€100
        private String price;

        public Phone(String name, String price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        private String getUnit() {
            return price.substring(0, 1);
        }

        private int getCount() {
            return Integer.parseInt(price.substring(1));
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
