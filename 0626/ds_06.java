import java.util.Random;

public class ds_06 {
    public static void main(String[] args) {
        int[] numbers = new int[10]; 
        Random rand = new Random();
        System.out.println("陣列內容如下：");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(101);
            System.out.print(numbers[i] + " ");
        }
        int max = numbers[0]; 
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("\n陣列中的最大值是：" + max);
    }
}
