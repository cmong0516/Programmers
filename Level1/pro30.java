package Level1;

class solution {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        solution1(a, b);
    }

    public static long solution1(int a, int b) {
        long answer = 0;

        int temp = 0;

        if (b < a) {
            temp = b;
            b = a;
            a = temp;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        for (int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }

}