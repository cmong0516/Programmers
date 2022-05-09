package Level1;

import java.util.Arrays;

class solution {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        solution1(s);
    }

    public static String solution1(String s) {
        String answer = "";

        char[] split = s.toCharArray();
        int[] intS = new int[split.length];
        for (int i = 0; i < s.length(); i++) {
            intS[i] = split[i];
        }

        Arrays.sort(intS);

        for (int i = 0; i < s.length() / 2; i++) {
            int temp = intS[i];
            intS[i] = intS[intS.length - i - 1];
            intS[intS.length - i - 1] = temp;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append((char) intS[i]);
        }
        // System.out.println("sb = " + sb);

        answer = String.valueOf(sb);

        return answer;
    }

}