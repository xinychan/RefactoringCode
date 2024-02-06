package j_Data_Clumps;

/**
 * 数据泥团（Data Clumps）
 */
public class Test2 {
    /**
     * 重构后：
     * 总是绑在一起出现的数据有单独的模块
     */
    class Student {
        private String name;
        private String id;
        private Score score;

        public Student(String name, String id) {
            this.name = name;
            this.id = id;
            this.score = new Score();
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getMathScore() {
            return score.getMathScore();
        }

        public void setMathScore(int mathScore) {
            score.setMathScore(mathScore);
        }

        public int getChineseScore() {
            return score.getChineseScore();
        }

        public void setChineseScore(int chineseScore) {
            score.setChineseScore(chineseScore);
        }

        public int getEnglishScore() {
            return score.getEnglishScore();
        }

        public void setEnglishScore(int englishScore) {
            score.setEnglishScore(englishScore);
        }

        public int getScoreSum() {
            return score.getScoreSum();
        }
    }

    // 分数数据集中在单独模块
    class Score {
        private int mathScore;
        private int chineseScore;
        private int englishScore;

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

        public int getScoreSum() {
            return mathScore + chineseScore + englishScore;
        }
    }
}
