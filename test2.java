import java.util.*;
class Solution2 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strArr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            strArr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strArr, (a, b) -> (b+a).compareTo(a+b));

        for (int i = 0; i < strArr.length; i++) {
            answer += strArr[i];
        }

        return answer;
    }
}

public class test2 {
    public static void main(String[] args) {
        int[] nums1 = {6, 10, 2};
        int[] nums2 = {3, 30, 34, 5, 9};
        System.out.println(new Solution2().solution(nums1));
        System.out.println(new Solution2().solution(nums2));
    }
}
