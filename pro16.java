public class Solution {
    public static void main(String[] args) {
        int N = 5;
        int []stage = {2,1,2,6,2,4,3,3};
        Solution s = new Solution();
        s.solution(N,stage);
    }

    public void solution(int N, int[] stages) {
        for (int stage : stages) {
            if (stage <= N) {
                System.out.println("stage = " + stage);
            }
        }
    }
}