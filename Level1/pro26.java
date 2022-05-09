class solution {
    public static void main(String[] args) {
        String s = "qwer";

        solution1(s);
    }

    public static String solution1(String s) {
        String answer = "";

        System.out.println("s.length() = " + s.length());

        if (s.length() % 2 == 1) {
            answer = String.valueOf(s.charAt(s.length() / 2));
        }
        if (s.length() % 2 == 0) {
            answer = String.valueOf(s.charAt(s.length() / 2 - 1)) + s.charAt(s.length() / 2);
        }
        System.out.println("answer = " + answer);
        return answer;
    }
}