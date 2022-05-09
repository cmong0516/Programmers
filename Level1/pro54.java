package Level1;

import java.util.Arrays;

class solution {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        solution1(x, n);
    }

    public static long[] solution1(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }

        return answer;
    }
}
