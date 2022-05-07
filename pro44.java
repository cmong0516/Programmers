import java.util.ArrayList;
import java.util.Collections;

class solution {
    public static void main(String[] args) {
        long n = 118372;
        solution1(n);
    }

    public static long solution1(long n) {
        long answer = 0;

        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add((int) (n % 10));
            n /= 10;
        }
        Collections.sort(list);
        Collections.reverse(list);

        for (Integer i : list) {
            sb.append(i);
        }
        answer = Long.valueOf(String.valueOf(sb));

        return answer;
    }
}