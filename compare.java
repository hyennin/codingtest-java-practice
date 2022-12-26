public class compare {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(2, 5));
        System.out.println(new Solution().solution(5, 5));
    }
}

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;

        if (num1 == num2) answer = 1;
        else answer = -1;

        return answer;
    }
}