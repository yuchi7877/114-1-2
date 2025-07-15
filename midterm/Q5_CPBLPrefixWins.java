import java.util.Scanner;

public class Q5_CPBLPrefixWins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] results = new int[n];
        String[] tokens = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            results[i] = Integer.parseInt(tokens[i]);
        }

        int k = Integer.parseInt(scanner.nextLine());

        int[] prefix = new int[n + 1]; 
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + results[i - 1];
        }
        System.out.print("PrefixSum:");
        for (int i = 1; i <= k; i++) {
            System.out.print(" " + prefix[i]);
        }
        System.out.println();
    }
}
