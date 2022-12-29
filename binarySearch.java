import java.util.Arrays;

class Solution3 {
    public long solution(int n, int[] times) {
        long answer = 0;

        Arrays.sort(times);
        int mid = 0, low = times[0], high = times[times.length-1];

        for (int i = 0; i < n; i++) {
            mid = (low + high) / 2;

            if (high * i > mid) low = mid + 1;
            else if (low * i < mid) high = mid - 1;
        }

        answer = mid;

        return answer;
    }
}

public class binarySearch {
    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};
        System.out.println(new Solution3().solution(n, times));
    }
}
