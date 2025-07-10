public class StudentGradeSystem {

    public static String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else {
            return "D";
        }
    }

    public static void printReport(int[] scores) {
        int total = 0;
        int max = scores[0], maxIndex = 0;
        int min = scores[0], minIndex = 0;

        int countA = 0, countB = 0, countC = 0, countD = 0;
        int countAboveAvg = 0;

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            total += score;

            if (score > max) {
                max = score;
                maxIndex = i;
            }
            if (score < min) {
                min = score;
                minIndex = i;
            }

            String grade = getGrade(score);
            switch (grade) {
                case "A": countA++; break;
                case "B": countB++; break;
                case "C": countC++; break;
                case "D": countD++; break;
            }
        }

        double average = (double) total / scores.length;

        for (int score : scores) {
            if (score > average) {
                countAboveAvg++;
            }
        }

        double aboveAvgPercentage = (double) countAboveAvg / scores.length * 100;

        System.out.println("======= 學生成績報告 =======");
        System.out.printf("總人數：%d%n", scores.length);
        System.out.printf("平均分數：%.2f%n", average);
        System.out.printf("最高分：%d (學生編號 %d)%n", max, maxIndex);
        System.out.printf("最低分：%d (學生編號 %d)%n", min, minIndex);
        System.out.println("----------------------------");
        System.out.printf("等級 A 人數：%d%n", countA);
        System.out.printf("等級 B 人數：%d%n", countB);
        System.out.printf("等級 C 人數：%d%n", countC);
        System.out.printf("等級 D 人數：%d%n", countD);
        System.out.printf("高於平均的學生比例：%.2f%%%n", aboveAvgPercentage);
        System.out.println("============================");

        System.out.println("學生編號 | 分數 | 等級");
        System.out.println("----------------------------");
        for (int i = 0; i < scores.length; i++) {
            String grade = getGrade(scores[i]);
            System.out.printf("%6d     | %3d  |  %s%n", i, scores[i], grade);
        }
        System.out.println("============================");
    }

    public static void main(String[] args) {
        int[] studentScores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};

        printReport(studentScores);
    }
}
