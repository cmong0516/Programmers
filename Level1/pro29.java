package Level1;

import java.util.ArrayList;
import java.util.Arrays;

class solution {
    public static void main(String[] args) {
        int[] arr = { 2, 36, 1, 3 };
        int divisor = 1;
        solution1(arr, divisor);
    }

    public static int[] solution1(int[] arr, int divisor) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            list.add(-1);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        System.out.println("answer = " + Arrays.toString(answer));
        return answer;
    }

}