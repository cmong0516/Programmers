class solution {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        solution(a, b);
    }

    public static String solution(int a, int b) {
        String answer = "";

        int[] lastDay = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int totalMDays = 0;

        for (int i = 1; i <= a; i++) {
            if (i == 1) {
                totalMDays = 0;
            } else {
                totalMDays += lastDay[i - 2];
            }
        }
        System.out.println("totalMDays = " + totalMDays);
        System.out.println();
        answer = day[(totalMDays + b - 1) % 7];
        return answer;
    }
}