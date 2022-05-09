package Level1;

import java.util.Arrays;

class solution {
    public static void main(String[] args) {
        int[] arr = { 100, 4, 20, 43, 99, 7, 8 };
        solution1(arr);
    }

    public static int[] solution1(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int[] answer2 = new int[1];
        int min = arr[0];
        int index = 0;
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }

        if (arr.length == 1) {
            answer2[0] = -1;
            return answer2;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (min == arr[i]) {
                    continue;
                } else {
                    answer[index++] = arr[i];
                }
            }
        }

        return answer;
    }
}