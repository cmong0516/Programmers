import java.util.*;

public class Solution {
    int answer = 0;

    public static void main(String[] args) {
        int[] numbers = { 1, 1, 1, 1, 1 };
        int target = 3;
        Solution s = new Solution();
        System.out.println(s.solution(numbers, target));
    }

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);

        return answer;
    }

    public void dfs(int[] numbers, int depth, int target, int sum) {
        System.out.println("sum = " + sum);
        if (depth == numbers.length) {
            if (target == sum) {
                answer++;
            }
        } else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]);
            dfs(numbers, depth + 1, target, sum - numbers[depth]);
        }
    }
}
