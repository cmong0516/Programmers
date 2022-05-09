class solution {
    public static void main(String[] args) {
        String s = "abcabcdede";
        solution(s);
    }

    public static int solution(String s) {
        int answer = s.length();

        // System.out.println(s.substring(0,1));
        // System.out.println(s.substring(1,2));
        // System.out.println(s.substring(2,3));
        // System.out.println(s.substring(3,4));
        // System.out.println(s.substring(4,5));
        // System.out.println(s.substring(5,6));
        // System.out.println(s.substring(6,7));
        // System.out.println(s.substring(7,8));
        // System.out.println();
        // System.out.println(s.substring(0,2));
        // System.out.println(s.substring(2,4));
        // System.out.println(s.substring(4,6));
        // System.out.println(s.substring(6,8));
        // System.out.println();
        // System.out.println(s.substring(0,3));
        // System.out.println(s.substring(3,6));
        if (s.length() == 1) {
            return 1;
        }
        for (int i = 1; i <= s.length() / 2; i++) {
            String temp = "";
            StringBuilder sb = new StringBuilder();
            int cnt = 1;
            for (int j = 0; j < s.length() / i; j++) {

                System.out.println("temp = " + temp);
                System.out.println("cnt = " + cnt);
                System.out.println("s.substring(i*j,(i*j)+i) = " + s.substring(i * j, (i * j) + i));
                if (temp.equals(s.substring(i * j, i * j + i))) {
                    cnt++;
                    continue;
                }
                if (cnt > 1) {
                    sb.append(cnt + temp);
                    cnt = 1;
                } else {
                    sb.append(temp);
                }
                temp = s.substring(i * j, i * j + i);

            }
            if (cnt > 1) {
                sb.append(cnt + temp);
                cnt = 1;
            } else {
                sb.append(temp);
            }

            if (s.length() % i != 0) {
                sb.append(s.substring(s.length() - s.length() % i, s.length()));
            }
            System.out.println("sb = " + sb);

            if (answer > sb.length()) {
                answer = sb.length();
            }

        }

        System.out.println("answer = " + answer);
        return answer;
    }
}
