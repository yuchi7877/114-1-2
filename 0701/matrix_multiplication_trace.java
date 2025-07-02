public class matrix_multiplication_trace {
    public static void main(String[] args) {
        int[][] a = {{11,12}, {13,14}};
        int[][] b = {{15, 16}, {17, 18}};
        int[][] c = new int[2][2];

        for (int i = 0; i < 2; i++) {          
            for (int j = 0; j < 2; j++) {      
                System.out.print("計算位置 c[" + i + "][" + j + "]：");
                int sum = 0;
                for (int k = 0; k < 2; k++) {  
                    int mul = a[i][k] * b[k][j];
                    sum += mul;
                    System.out.print(a[i][k] + "*" + b[k][j]);
                    if (k < 1) {
                        System.out.print(" + ");
                    } else {
                        System.out.print(" = ");
                    }
                }
                System.out.println(sum);
                c[i][j] = sum; 
            }
        }

        System.out.println("結果矩陣：");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
