class solution {
    public static void main(String[] args) {
        int num = 3;
        solution1(num);
    }

    public static String solution1(int num) {
        String answer = "";

        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }

        return answer;
    }
}