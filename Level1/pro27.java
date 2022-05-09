import java.util.Arrays;

class solution {
    public static void main(String[] args) {
        String s = "1D2S#10S";

        solution1(s);
    }

    public static int solution1(String dartResult) {
        int answer = 0;
        // S 1제곱 D 2제곱 T 3제곱
        // * : 현재점수 , 전점수 *2
        // # : 해당점수 -
        char[] ch = dartResult.toCharArray();
        int[] score = new int[3];
        int index = -1;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                index++;
                score[index] = Integer.parseInt(String.valueOf(ch[i]));

                if (i + 1 != ch.length - 1 && ch[i] == '1' && ch[i + 1] == '0') {
                    System.out.println("ch[i]+ch[i+1] = " + ch[i] + ch[i + 1]);
                    score[index] = 10;
                    i++;
                }
            } else if (ch[i] == 'D') {
                score[index] *= score[index];
            } else if (ch[i] == 'T') {
                score[index] = score[index] * score[index] * score[index];
            } else if (ch[i] == '*') {
                if (index > 0) {
                    score[index - 1] *= 2;
                }
                score[index] *= 2;
            } else if (ch[i] == '#') {
                score[index] *= -1;
            }
        }

        for (int i : score) {
            answer += i;
        }

        System.out.println("answer = " + answer);

        return answer;
    }

}