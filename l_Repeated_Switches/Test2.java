package l_Repeated_Switches;

/**
 * 重复的switch （Repeated Switches）
 */
public class Test2 {
    /**
     * 重构后：
     * 使用多态的方式替换switch
     * 只需要修改一处switch
     * 修改一个条件逻辑时，不容易影响到其他条件
     */
    class RepeatedSwitches {
        public Price createPrice(String value) {
            String unit = value.substring(0, 1);
            switch (unit) {
                case "￥":
                    return new CnyPrice(value);
                case "$":
                    return new UsdPrice(value);
                case "€":
                    return new EurPrice(value);
                default:
                    return null;
            }
        }

        public void priceTest(String value) {
            createPrice(value).priceUnit();
            createPrice(value).priceCnyCount();
        }
    }

    abstract class Price {
        // ￥100/$100/€100
        private String value;

        public Price(String value) {
            this.value = value;
        }

        protected int getCount() {
            return Integer.parseInt(value.substring(1));
        }

        abstract protected String priceUnit();

        abstract protected int priceCnyCount();
    }

    class CnyPrice extends Price {
        public CnyPrice(String value) {
            super(value);
        }

        @Override
        public String priceUnit() {
            return "人民币";
        }

        @Override
        public int priceCnyCount() {
            return getCount();
        }
    }

    class UsdPrice extends Price {
        public UsdPrice(String value) {
            super(value);
        }

        @Override
        public String priceUnit() {
            return "美元";
        }

        @Override
        public int priceCnyCount() {
            return getCount() * 7;
        }
    }

    class EurPrice extends Price {
        public EurPrice(String value) {
            super(value);
        }

        @Override
        public String priceUnit() {
            return "欧元";
        }

        @Override
        public int priceCnyCount() {
            return getCount() * 8;
        }
    }
}
