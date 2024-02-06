package j_Data_Clumps;

/**
 * 数据泥团（Data Clumps）
 */
public class Test {
    /**
     * 重构前：
     * 所有数据项在一个模块内混在一起
     */
    class Student {
        private String name;
        private String id;
        private int mathScore;
        private int chineseScore;
        private int englishScore;

        public Student(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getMathScore() {
            return mathScore;
        }

        public void setMathScore(int mathScore) {
            this.mathScore = mathScore;
        }

        public int getChineseScore() {
            return chineseScore;
        }

        public void setChineseScore(int chineseScore) {
            this.chineseScore = chineseScore;
        }

        public int getEnglishScore() {
            return englishScore;
        }

        public void setEnglishScore(int englishScore) {
            this.englishScore = englishScore;
        }

        // 分数数据高度绑定
        public int getScoreSum() {
            return mathScore + chineseScore + englishScore;
        }
    }

}
