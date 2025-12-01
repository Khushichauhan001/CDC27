package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ActivitySelection {
    public static int activitySelection(int[] start, int[] finish) {
        int n = start.length;
        if (n == 0) return 0;

        int[][] act = new int[n][2];
        for (int i = 0; i < n; i++) {
            act[i][0] = start[i];
            act[i][1] = finish[i];
        }
        Arrays.sort(act, (a, b) -> Long.compare(a[1], b[1]));

        int count = 1;
        long lastFinish = act[0][1];

        for (int i = 1; i < n; i++) {
            if (act[i][0] > lastFinish) {
                count++;
                lastFinish = act[i][1];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        if (!sc.hasNextInt()) return;
        int first = sc.nextInt();
        if (!sc.hasNextInt()) {
            System.out.println(0);
            return;
        }
        int n = first;
        int[] start = new int[n];
        for (int i = 0; i < n; i++) start[i] = sc.nextInt();
        int[] finish = new int[n];
        for (int i = 0; i < n; i++) finish[i] = sc.nextInt();

        System.out.println(activitySelection(start, finish));
        sc.close();
    }
}
