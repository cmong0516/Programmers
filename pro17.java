class solution {
    public static void main(String[] args) {
        solution(13, 17);
    }

    public static int solution(int left, int right) {
        int answer = 0;
        int cnt = 0;
        for (int i = left; i <= right; i++) {
            // System.out.println("i = " + i);
            for (int j = 1; j <= i; j++) {
                // System.out.println("j = " + j);
                if (i % j == 0) {
                    cnt++;
                }
                // System.out.println("cnt = " + cnt);
            }
            if (cnt % 2 == 1) {
                answer -= i;
            }
            if (cnt % 2 == 0) {
                answer += i;
            }
            // System.out.println("answer = " + answer);
            cnt = 0;
        }

        return answer;
    }
}