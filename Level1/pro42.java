class solution {
    public static void main(String[] args) {
        int n = 123;
        solution1(n);
    }

    public static int solution1(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n = n / 10;
        }

        return answer;
    }
}