class solution {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        solution1(s, n);
    }

    public static String solution1(String s, int n) {
        String answer = "";

        char[] arr = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (c >= 97 && c <= 122) {
                if ((char) (c + n) > 122) {
                    sb.append((char) (c + n - 26));
                } else {
                    sb.append((char) (c + n));
                }
            }
            if (c >= 65 && c <= 90) {
                if ((char) (c + n) > 90) {
                    sb.append((char) (c + n - 26));
                } else {
                    sb.append((char) (c + n));
                }
            }
            if (c == ' ') {
                sb.append(' ');
            }
        }

        answer = String.valueOf(sb);

        return answer;
    }
}