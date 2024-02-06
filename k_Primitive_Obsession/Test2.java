package k_Primitive_Obsession;

/**
 * 基本类型偏执（Primitive Obsession）
 */
public class Test2 {
    /**
     * 重构后：
     * 以对象取代基本类型，将原本单独存在的数据值替换为对象
     */
    class Phone {
        private String name;
        private Price price;

        public Phone(String name, String price) {
            this.name = name;
            this.price = new Price(price);
        }

        public String getName() {
            return name;
        }

        public String priceUnit() {
            return price.priceUnit();
        }

        public int priceCnyCount() {
            return price.priceCnyCount();
        }
    }

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
