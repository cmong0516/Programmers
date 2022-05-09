package Level1;

class solution {
    public static void main(String[] args) {
        int n = 3;
        solution1(n);
    }

    public static String solution1(int n) {
        String answer = "";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append("수");
            }
            if (i % 2 == 1) {
                sb.append("박");
            }
        }
        // System.out.println("sb = " + sb);
        answer = String.valueOf(sb);

        return answer;
    }
}