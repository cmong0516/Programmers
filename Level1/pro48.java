package Level1;

import java.util.ArrayList;
import java.util.Arrays;

class solution {
    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        solution1(n, m);
    }

    public static int[] solution1(int n, int m) {
        int[] answer = new int[2];

        int max = Math.max(n, m);
        int min = Math.min(n, m);

        while (min != 0) {
            int temp = max % min;
            max = min;
            min = temp;
        }

        answer[0] = max;

        answer[1] = max * (n / max) * (m / max);

        System.out.println("answer = " + Arrays.toString(answer));

        return answer;
    }
}