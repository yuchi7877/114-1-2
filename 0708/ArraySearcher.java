public class ArraySearcher {
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1;
    }
    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] numbers = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};
        int target1 = 67;
        int index1 = findElement(numbers, target1);
        int count1 = countOccurrences(numbers, target1);

        if (index1 != -1) {
            System.out.println("數字 " + target1 + " 的索引位置為：" + index1);
            System.out.println("數字 " + target1 + " 出現次數為：" + count1);
        } else {
            System.out.println("數字 " + target1 + " 未在陣列中找到");
        }
        int target2 = 100;
        int index2 = findElement(numbers, target2);
        int count2 = countOccurrences(numbers, target2);

        if (index2 != -1) {
            System.out.println("數字 " + target2 + " 的索引位置為：" + index2);
            System.out.println("數字 " + target2 + " 出現次數為：" + count2);
        } else {
            System.out.println("數字 " + target2 + " 未在陣列中找到");
        }
    }
}
