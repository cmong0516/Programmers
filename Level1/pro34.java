package Level1;

class solution {
    public static void main(String[] args) {
        String s = "a234";
        System.out.println(solution1(s));
    }

    public static boolean solution1(String s) {
        boolean answer = true;

        char[] list = s.toCharArray();
        char a = '0';
        char b = '9';
        // System.out.println((int)a);
        // System.out.println((int)b);

        for (char c : list) {
            if ((int) c > b) {
                answer = false;
            }
        }
        if (s.length() != 4 && s.length() != 6) {
            answer = false;
        }
        return answer;
    }

}