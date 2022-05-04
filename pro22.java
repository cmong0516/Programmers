class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;

        int a1 = 0;
        int b1 = 0;

        for (int i = 0; i < sizes.length; i++) {
            int a = Math.max(sizes[i][0], sizes[i][1]);
            int b = Math.min(sizes[i][0], sizes[i][1]);
            a1 = Math.max(a1, a);
            b1 = Math.max(b1, b);
        }
        // System.out.println("a1 = " + a1);
        // System.out.println("b1 = " + b1);
        answer = a1 * b1;

        return answer;
    }
}