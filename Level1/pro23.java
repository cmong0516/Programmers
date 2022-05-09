package Level1;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        // System.out.println("answer = " + answer);
        return answer;
    }
}