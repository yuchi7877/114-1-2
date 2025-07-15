public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] stops = new String[n];
        String line = scanner.nextLine();
        stops = line.split(" ");
        String start = scanner.next();
        String end = scanner.next();
        int startIdx = -1;
        int endIdx = -1;

        for (int i = 0; i < stops.length; i++) {
            if (stops[i].equals(start)) {
                startIdx = i;
            }
            if (stops[i].equals(end)) {
                endIdx = i;
            }
        }
        if (startIdx == -1 || endIdx == -1) {
            System.out.println("Invalid");
        } else {
            int stopCount = Math.abs(startIdx - endIdx) + 1;
            System.out.println(stopCount);
        }
    }
}
