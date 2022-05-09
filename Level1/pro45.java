package Level1;

class solution {
    public static void main(String[] args) {
        long n = 121;
        solution1(n);
    }

    public static long solution1(long n) {
        long answer = 0;

        if (Math.sqrt(n) % 1 == 0) {
            answer = (long) (Math.sqrt(n) + 1) * (long) (Math.sqrt(n) + 1);
        } else {
            answer = -1;
        }

        return answer;
    }
}