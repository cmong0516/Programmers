package Level1;

import java.util.HashSet;

class solution {
    public static void main(String[] args) {
        int[] numbers = { 2, 1, 3, 4, 1 };
        solution(numbers);
    }

    public static int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            // System.out.println("numbers[i] ====== " + numbers[i]);
            for (int j = i + 1; j < numbers.length; j++) {
                // System.out.println("numbers[j] = " + numbers[j]);
                list.add(numbers[i] + numbers[j]);
            }
        }
        answer = list.stream().sorted().mapToInt(Integer::intValue).toArray();

        // System.out.println("list = " + list);

        return answer;
    }
}