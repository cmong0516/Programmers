class solution {
    public static void main(String[] args) {
        String[] seoul = { "Jane", "Kim" };
        solution1(seoul);
    }

    public static String solution1(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        // System.out.println("answer = " + answer);

        return answer;
    }

}