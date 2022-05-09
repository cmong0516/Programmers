import java.util.Arrays;

class solution {
    public static void main(String[] args) {
        String s = "try  hello world hi";
        solution1(s);
    }

    public static String solution1(String s) {
        String answer = "";

        StringBuilder sb = new StringBuilder();
        String[] splitS = s.split("");

        int cnt = 1;
        for (int i = 0; i < splitS.length; i++) {

            if (splitS[i].equals(" ")) {
                sb.append(" ");
                cnt = 1;
            } else {
                if (cnt % 2 == 1) {
                    sb.append(splitS[i].toUpperCase());
                    cnt++;
                    continue;
                }
                if (cnt % 2 == 0) {
                    sb.append(splitS[i].toLowerCase());
                    cnt++;
                    continue;
                }
            }

        }

        answer = String.valueOf(sb);

        return answer;
    }
}