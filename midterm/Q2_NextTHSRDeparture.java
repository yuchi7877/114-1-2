public class Q2_NextTHSRDeparture {
    public static int timeToMinutes(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int min = Integer.parseInt(parts[1]);
        return hour * 60 + min;
    }
    public static String minutesToTime(int minutes) {
        int hour = minutes / 60;
        int min = minutes % 60;
        return String.format("%02d:%02d", hour, min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] times = new int[n];

        for (int i = 0; i < n; i++) {
            String timeStr = scanner.nextLine();
            times[i] = timeToMinutes(timeStr);
        }

        String queryStr = scanner.nextLine();
        int queryTime = timeToMinutes(queryStr);

        int left = 0, right = n - 1;
        int resultIdx = n; 

        while (left <= right) {
            int mid = (left + right) / 2;
            if (times[mid] > queryTime) {
                resultIdx = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (resultIdx == n) {
            System.out.println("No train");
        } else {
            System.out.println(minutesToTime(times[resultIdx]));
        }

    }
}
