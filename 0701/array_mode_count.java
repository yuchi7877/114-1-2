public class array_mode_count {
    public static void main(String[] args) {
        int[] arr = {1,3,7,1,7,1};

        int mode = arr[0];      
        int maxCount = 0;      

        for (int i = 0; i < arr.length; i++) {
            int count = 0; 

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println("比對中：" + arr[i] + " 出現次數 = " + count);

            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }

        System.out.println("眾數為：" + mode + "，出現 " + maxCount + " 次");
    }
}
