import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

class solution {
    public static void main(String[] args) {
        int[] d = { 2, 2, 3, 3 };
        int budget = 10;
        solution(d, budget);
    }

    public static int solution(int[] d, int budget) {
        AtomicInteger answer = new AtomicInteger();

        AtomicInteger now = new AtomicInteger();

        IntStream intStream = Arrays.stream(d);
        intStream.sorted().forEach(i -> {
            if (i + now.get() <= budget) {
                now.addAndGet(i);
                answer.getAndIncrement();
            }
        });
        System.out.println("answer = " + answer);

        return answer.get();
    }
}