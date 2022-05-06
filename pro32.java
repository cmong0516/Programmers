import java.util.Arrays;

class solution {
    public static void main(String[] args) {
        String s = "pPoooyY";
        solution1(s);
    }

    public static boolean solution1(String s) {
        boolean answer = false;
        s = s.toLowerCase();
        System.out.println("s = " + s);

        String[] split = s.split("");

        System.out.println("split = " + Arrays.toString(split));
        int cnt = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("p")) {
                cnt++;
            }
            if (split[i].equals("y")) {
                cnt--;
            }
        }
        if (cnt == 0) {
            answer = true;
        }
        return answer;
    }

}