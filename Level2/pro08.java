import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] scoville = { 1, 2, 3, 9, 10, 12 };
        int K = 7;
        solution(scoville, K);
    }

    static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();

        for (int s : scoville) {
            heap.offer(s);
        }
        System.out.println("heap = " + heap);

        while (heap.peek() <= K) {
            System.out.println("heap = " + heap);
            if (heap.size() == 1) {
                return -1;
            }
            int a = heap.poll();
            System.out.println("a = " + a);
            int b = heap.poll();
            System.out.println("b = " + b);

            int result = a + (b * 2);

            heap.offer(result);
            answer++;
        }
        return answer;

    }
}
