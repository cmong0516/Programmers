class solution {
    public static void main(String[] args) {
        int n = 10;
        solution1(n);
    }

    public static int solution1(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (i > 2 && i % 2 == 0) {
                continue;
            }

            int cnt = 0;
            for (int j = 1; j <= n; j++) {

                if (i % j == 0) {
                    cnt++;
                }
                if (cnt > 2) {
                    continue;
                }
            }
            if (cnt == 2) {
                answer++;
            }
        }

        return answer;
    }

}

// 효율성 문제는 소수의 특징을 알아야해서 패스한다.