package Level1;

import java.util.ArrayList;

class solution {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
        solution1(arr);
    }

    public static int[] solution1(int[] arr) {

        int temp = -1;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp) {
                list.add(arr[i]);
                temp = arr[i];
            }
        }
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

}