package Level1;

class solution {
    public static void main(String[] args) {
        int n = 12;
        solution1(n);
    }

    public static int solution1(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }
}