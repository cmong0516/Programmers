package Level1;

class solution {
    public static void main(String[] args) {
        int x = 11;
        solution1(x);
    }

    public static boolean solution1(int x) {
        boolean answer = true;
        int total = 0;
        int y = x;
        while (x > 0) {
            total += x % 10;
            x /= 10;
        }

        System.out.println("total = " + total);
        if (y % total != 0) {
            answer = false;
        }

        return answer;
    }
}

// 에이 ㅋ