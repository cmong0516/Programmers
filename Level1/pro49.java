class solution {
    public static void main(String[] args) {
        int num = 626331;
        solution1(num);
    }

    public static int solution1(int num) {
        int answer = 0;
        long a = num;

        while (a != 1) {
            if (answer > 500) {
                return -1;
            }
            if (a % 2 == 0) {
                a = a / 2;
                answer++;
                continue;
            }
            if (a % 2 == 1) {
                a = (a * 3) + 1;
                answer++;
                continue;
            }

        }

        return answer;
    }
}

// 계산중 타임이 int 로 해결되지 않는 수가 숨겨진 문제.