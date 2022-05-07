import java.util.ArrayList;

class solution {
    public static void main(String[] args) {
        long n = 12345;
        solution1(n);
    }

    public static int[] solution1(long n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add((int) (n % 10));
            n /= 10;
        }

        System.out.println("list = " + list);
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}